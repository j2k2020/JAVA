package ch18.sec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreadEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/test/Dir/file1.txt");

//		String newStr = null;
//		while (true) {
//			int data = fis.read(); // 1����Ʈ�� ����
//
//			if (data == -1)
//				break; // �� �о����� (-1��ȯ)����
//			//System.out.println(data);
//			System.out.print((char)data);
//		}
		
		
		fis.close();

	}
}

//fis.read(): �ƽ�Ű �ڵ尪 ��ȯ
//13: ����(ĳ���� ����)
//10: �ٹٲ�(���� �ǵ�)
