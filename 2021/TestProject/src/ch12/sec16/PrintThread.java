package ch12.sec16;

public class PrintThread extends Thread {

	@Override
	public void run() {
		// ���� �ݺ�

		//���1
		/*
		while (true) {
			System.out.println("���� ��");
			// �Ͻ� ���� ���� ���� ���
		
			 //* interrupt�� ���������� Ȯ���ϰ� 
			// * interrupt�Ǿ����� ���� 
			// * interrupted()�żҵ� �Ǵ� isInterrrupted()�żҵ� ���
			
			//Thread.interrupted(): interrupted()�� Thread�� ���� �żҵ�
			
			if (Thread.interrupted()) { // interrupt�Ǿ�����
				break; // while�� ����
			}
		}
	*/
		
		
		
		//���2
		//isInetrrupted()�żҵ� ���
		//Thread Ŭ������ �ν��Ͻ� �żҵ� isInterrupted()���
		while (true) {
			System.out.println("���� ��");
			if (isInterrupted()) { // interrupt�Ǿ�����
				break; // while�� ����
			}
		}

		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
