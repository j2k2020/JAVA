import java.io.*;

public class FileInfo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요.");
		String filename=br.readLine();
		
		File f=new File("src\\"+ filename);
		if(f.exists()) {
			System.out.println("파일이름:"+f.getName());
			System.out.println("상대경로:"+f.getPath());
			System.out.println("절대패스:"+f.getAbsolutePath());
			System.out.println("읽기가능:"+f.canRead());
			System.out.println("쓰기가능:"+f.canWrite());
			System.out.println("파일길이:"+f.length());
			System.out.println(f.lastModified());
			
		}
		
	}

}
