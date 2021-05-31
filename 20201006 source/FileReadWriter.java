import java.io.*;

public class FileReadWriter {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요?");
		String filename = br.readLine();
		System.out.println(filename);
		System.out.println("파일 내용을 입력하세요?");
		String source = br.readLine();
		System.out.println(source);
		
		//파일을 만들기 위해서 파일명과 파일내용이 필요하므로
		//먼저 필요한 내용을 받은것임
		
		FileWriter fw=new FileWriter(filename);
		fw.write(source);
		fw.close();
		
		//출력할 내용에 대한 입력(파일명)
		System.out.println("출력할 파일명을 입력하세요?");
		filename = br.readLine();
		System.out.println(filename);
		
		//파일 내용을 가지고 와서 출력
		File f=new File(filename);
		FileReader fr=new FileReader(f);
		br=new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		br.close();
		fr.close();

	}

}
