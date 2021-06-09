package ch11.sec02;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
	byte[] bytes = new byte[100];
	
	System.out.println("입력: ");
	int readByteNo = System.in.read(bytes);
	
	System.out.println(readByteNo+"바이트 입니다.");

	}

}
