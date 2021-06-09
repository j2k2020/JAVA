package ch18.sec02;

import java.io.FileInputStream;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("src\\ch18\\sec02\\file1.txt");
			//read(byte)�޼ҵ� ����ؼ� �а� ���
			//byte[]�� ���ڿ��� ��ȯ�ؼ� ���
			//String(����Ʈ �迭, ���� ���ؽ�, ���� ����Ʈ ��) ������ ����ؼ� ���ڿ��� ��ȯ
			byte[] data = new byte[200];
			int bytes = fis.read(data);
			System.out.print(new String(data,0,bytes-2)); //-2�� ������?
			//-2��? ������ ���͸� �д� ��! 
			//�׷��� ������ �� ���� ������ ���͸� �־��ִ���, -2�� �����ϴ����ؾ��� ������ �� ����
			
			fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
