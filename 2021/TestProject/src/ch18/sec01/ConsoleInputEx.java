package ch18.sec01;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputEx {

	public static void main(String[] args) throws IOException {
		// 콘솔 입력: System.in 필드 사용
		InputStream is = System.in;
		System.out.println("입력:"); //a를 입력-> 아스키 코드값으로 읽어 들임
		//읽은 내용 바로 출력
		
		//문자를 아스키 코드 값으로 변환해서 출력
		System.out.println(is.read());
		
		//아스키 코드 값을 문자로 변환해서 출력
				System.out.println((char)is.read());
				
				byte[] data = new byte[10];
				System.out.println("이름 입력:");
				int bytes = is.read(data);
				System.out.println(bytes);

	}

}
