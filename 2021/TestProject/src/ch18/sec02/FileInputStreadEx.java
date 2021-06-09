package ch18.sec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreadEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/test/Dir/file1.txt");

//		String newStr = null;
//		while (true) {
//			int data = fis.read(); // 1바이트씩 읽음
//
//			if (data == -1)
//				break; // 다 읽었으면 (-1반환)종료
//			//System.out.println(data);
//			System.out.print((char)data);
//		}
		
		
		fis.close();

	}
}

//fis.read(): 아스키 코드값 반환
//13: 엔터(캐리지 리턴)
//10: 줄바꿈(라인 피드)
