package ch12.sec14;

//������ ���Ḧ ���� stop�÷��� �̿�
//stop �÷��׷�run()�żҵ��� ���� ���� ����
//run()�żҵ尡 ����Ǹ� ������ ����
//stop ���� true �Ǵ� false�������� Ȯ���ؼ� �����ϴ� ���
public class PrintThread extends Thread {
	private boolean stop;
	
	//�ܺο��� stop�� ���� ����
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) { //������ true�� while�� ����(stop�� true�� ���)
			System.err.println("���� ��");
		}
		System.err.println("�ڿ� ����");
		System.err.println("���� ����");
	}
	
	
	

}
