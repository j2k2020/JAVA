package ch12.sec06;

/*
 * us1�� ���� 100���� �����ϰ� 2�� ��� ���� �߿�
 * user2�� ���� 50���� ������ ���
 * user1�� ������ �� 100�� �ƴ� ����� �� 50�� ��µǴ� ����
 * */

public class Calculator{ //Ŭ����
	private int memorey; //�ʵ�
	
	public int getMemory() {
		return memorey;
	}

	public void setMemorey(int memorey) {
		this.memorey = memorey;
	try {
		Thread.sleep(2000); //2�ʰ� ����
	}catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memorey);
	}
}
