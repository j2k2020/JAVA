package ch12.sec08;

//TargetThread�� ���¸� ����������
public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targThread) {
		this.targetThread = targThread;
	}
	
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����:"+state);
			
		}
		
	}

}
