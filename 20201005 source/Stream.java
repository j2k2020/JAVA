import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream {

    public static void main(String[] args) throws IOException {
    	System.out.println("디렉토리명을 입력하세요");
    	InputStreamReader isr = new InputStreamReader(System.in);
        //키보드로부터 읽은 텍스트를 한자씩 출력
        /*
        while (true) {
            int c = isr.read();
            if (c == -1)
                break;
            System.out.println((char) c);
        }
        */
        //isr은 한자씩 읽는 기능만 있기 때문에 불편함
        //그래서 BufferedReader를 사용함(readLine()함수가 존재)
        
        BufferedReader br=new BufferedReader(isr);
        //System.out.println(br.readLine());
        String src=br.readLine().toString();
        File f=new File(src);
        //File f=new File((String)(br.readLine()+"\n"));
        //f.mkdir();
        //new File(br.readLine().toString()).mkdir();
        String s[]=f.list();
        for(int i=0; i < s.length; i++) {
        	File isf=new File(src+"\\"+s[i]);
        	if(isf.isDirectory()) {
        	System.out.println("dir:"+s[i]);
        	}else {
        	System.out.println("file:"+s[i]);
        	}
        }
    }

}