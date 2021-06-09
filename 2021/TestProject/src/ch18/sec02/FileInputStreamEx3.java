package ch18.sec02;

import java.io.FileInputStream;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("src\\ch18\\sec02\\file1.txt");
			//read(byte)메소드 사용해서 읽고 출력
			//byte[]을 문자열로 변환해서 출력
			//String(바이트 배열, 시작 인텍스, 읽은 바이트 수) 생성자 사용해서 문자열로 변환
			byte[] data = new byte[200];
			int bytes = fis.read(data);
			System.out.print(new String(data,0,bytes-2)); //-2한 이유는?
			//-2는? 마지막 엔터를 읽는 것! 
			//그래서 문장을 다 적고 마지막 엔터를 넣어주던가, -2를 제외하던가해야지 파일이 다 나옴
			
			fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
