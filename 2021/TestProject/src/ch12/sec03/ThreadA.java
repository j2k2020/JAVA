package ch12.sec03;

//2�� ������ Ŭ���� ����
//A: ������ �̸� ����
//B: �̸��� �������� x. (Thread-N)���� ���
public class ThreadA extends Thread {
	
	//�����ڿ��� ������ �̸� ����
	public ThreadA() {
		setName("������A");
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"�� ����� ����");
			//getName(): ������ �̸� ��ȯ
			//Thread Ŭ������ �ν��Ͻ� �޼ҵ�
			//��ӹ��� ThreadA���� ȣ���ؼ� ��� ����
		}
	}

}
