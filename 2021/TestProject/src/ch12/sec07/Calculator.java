package ch12.sec07;

/*
 * ����ȭ �޼ҵ�: synchronized Ű���� ���� (lock(���)�� 
 * �Ӱ� �������� �� ���� �� �����常 ���� ����
 * �ٸ� ������� �޼ҵ� �Ǵ� ����� ������ ���� ������ ���
 * 
 * */

public class Calculator{
	private int memorey;
	
	public int getMemory() {
		return memorey;
	}

	public void setMemorey(int memorey) {
		this.memorey = memorey;
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memorey);
	}
}
