package ch12.sec15;

public class PrintThread extends Thread{

	@Override
	public void run() {
		//���� �ݺ�
		try {
			while (true) {
				System.out.println("���� ��");
				//�Ͻ� ���� ���°� ������ interrupt()�� ȣ���ص� ���� �ʵ�
				Thread.sleep(1); //�Ͻ� ���� ����
				//interrupt()ȣ�� �� ���� �߻�
			}
		} catch (InterruptedException e) {}
		
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
