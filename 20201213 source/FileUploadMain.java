import java.io.*;
import java.net.*;

class FileUpload extends Thread{
String url;
String filename;

public FileUpload(String url, String filename) {
	super();
	this.url = url;
	this.filename = filename;
}

public void run() {
	
	try {
	URL _url=new URL(url);
	InputStream is=_url.openStream();
	BufferedInputStream br=new BufferedInputStream(is);
	//입력스트림에서 1byte데이터를 처리할 때 BufferedInputStram을 바로 이용
	
	FileOutputStream fos=new FileOutputStream(filename);
	
	byte buf[]=new byte[1024];
	java.net.URLConnection con=_url.openConnection();
	int size=con.getContentLength();
	System.out.println(size);
	
	int imgData=0;
	int cnt=0;
	while((imgData=br.read(buf))!=-1) {
				fos.write(buf,0,imgData);
				fos.flush();
				cnt+=imgData;
				//System.out.println("file 전송 크기 :"+ cnt);
				System.out.println(filename+":"+((cnt*100)/size)+"%");
				
				Thread.sleep(100);
	}
	fos.close();
	br.close();
	is.close();
	}catch(MalformedURLException e) {}
    catch(IOException e) {}
	catch(Exception e) {}
	
}
}

public class FileUploadMain{
	public static void main(String[] args) {
		FileUpload file1=new FileUpload("https://huvitled.co.kr/web/product/big/201905/24baf0acc819d3f8a97b5f4424b3b987.jpg","file1.jpg");
		FileUpload file2=new FileUpload("https://www.vittz.co.kr/shopimages/vittz/0930010000083.jpg","file2.jpg");
		
		file1.start();
		file2.start();
}

}

