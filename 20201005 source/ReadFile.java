import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="src\\ReadFile.java";
		File f=new File(fname);
		char[] buf=new char[256];
		//System.out.println(f.getAbsolutePath());
		try {
			FileReader fr=new FileReader(f);
			//fr.read(buf,0,20);
			//System.out.println(buf);
			//System.out.println((char)fr.read());
			BufferedReader br=new BufferedReader(fr);
			//System.out.println((char)br.read());
			String s="";//한라인을 받는데 사용하는 변수
			StringBuffer sb=new StringBuffer();//전체를 받는데 사용하는 변수
			while((s=br.readLine())!=null) {
			//System.out.println(br.readLine());
			sb.append(s+"\n");	
			}
			System.out.println(sb);
			//s=sb.toString();
			//System.out.println(s);
			
			br.close();
			fr.close();
		}catch(Exception e) {
			
		}
	}

}
