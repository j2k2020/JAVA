package ch12.sec05;

public class ThreadPrlorlty {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//�������� ��(����)�� ���
//			Thread thread = new CalcThread("thrad:"+i);
//			thread.start();
			
			
			Thread thread = new CalcThread("thrad:"+i);
			
			if(i != 10) { //i�� 10�� �ƴϸ�
			thread.setPriority(Thread.MIN_PRIORITY);
		}else {
			thread.setPriority(Thread.MAX_PRIORITY);
		}
			
			thread.start();
			
		}
	}

}
