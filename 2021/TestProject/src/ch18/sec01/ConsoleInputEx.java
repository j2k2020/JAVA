package ch18.sec01;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputEx {

	public static void main(String[] args) throws IOException {
		// �ܼ� �Է�: System.in �ʵ� ���
		InputStream is = System.in;
		System.out.println("�Է�:"); //a�� �Է�-> �ƽ�Ű �ڵ尪���� �о� ����
		//���� ���� �ٷ� ���
		
		//���ڸ� �ƽ�Ű �ڵ� ������ ��ȯ�ؼ� ���
		System.out.println(is.read());
		
		//�ƽ�Ű �ڵ� ���� ���ڷ� ��ȯ�ؼ� ���
				System.out.println((char)is.read());
				
				byte[] data = new byte[10];
				System.out.println("�̸� �Է�:");
				int bytes = is.read(data);
				System.out.println(bytes);

	}

}
