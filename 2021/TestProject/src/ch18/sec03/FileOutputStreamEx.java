package ch18.sec03;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args){
		FileOutputStream os = null;

		try {
			//���� �ٽ� �ϸ� ���� ���� ���
			//os = new FileOutputStream("src\\ch18\\sec02\\fileWrite.txt");
			
			//�߰� ���(append���)�� ������ ���� (���� �� �޺κп� �߰���)
			os = new FileOutputStream("src\\ch18\\sec02\\fileWrite.txt");


			// ����� ���ڿ�
			String strOut = "�ȳ��ϼ���. ���Ϸ� ��µ˴ϴ�."; //���� ���� �ٽ��ϸ� ���� ���� ���!
			byte[] bs = strOut.getBytes(); // ����Ʈ �迭�� ��ȯ

			os.write(bs);
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
