package ch12.sec10;

public class ThreadB extends Thread{
	//���� ���¿� �۾� ���� ���¸� �˱� ���� �ʵ� �ʱ�ȭ
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop){ //������ true�̸� �ݺ��� ���
			if(work) {
				System.out.println("ThreadB �۾� ����");
			}else {
				Thread.yield();
			}
			System.out.println("ThreadB����");
		}
	}
	

}
