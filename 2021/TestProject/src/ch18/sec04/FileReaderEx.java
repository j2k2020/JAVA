package ch18.sec04;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) throws Exception{
		//�ý�Ʈ ���Ϸκ��� ������ �о� �� �� ���
		FileReader fr = new FileReader("src\\ch18\\sec04\\FileReaderEx.java");
		
		int readCharNo;
		char[] charBuf = new char[100];
		
		while((readCharNo = fr.read(charBuf))!= -1) {
			String data = new String(charBuf, 0, readCharNo);
			System.out.print(data); //�� print�� �ϱ�
		}
		fr.close();

	}

}
