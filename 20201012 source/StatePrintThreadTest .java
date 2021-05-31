class TargetThread extends Thread{
	public void run() {
	for(long i=0;i<1000000000;i++) { }
	try { Thread.sleep(1500);}catch(Exception e) {}
	for(long i=0;i<1000000000;i++) {}
	//try { Thread.sleep(1500);}catch(Exception e) {}
	}
}

class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread=targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state=targetThread.getState();
			System.out.println("타겟스레드상태:"+state);
			if(state==Thread.State.NEW) {targetThread.start();}
			if(state==Thread.State.TERMINATED) { break;}
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
	}
	
}
public class StatePrintThreadTest {

	public static void main(String[] args) {
		StatePrintThread s=new StatePrintThread(new TargetThread());
		s.start();
	}

/*
 * 1.StatePrintThred객체는 스레드로 동작하며 작업을 계속진행하는 객체이다.
 * 2.위의 객체를 생성하면서 다른 쓰레드 객체를 전달받아 저장한다.
 * 3.저장된 객체는 start()함수를 이용해 실행되지 않은 상태이다. 이 때 getState()함수를 이용하여 현재 상태를 확인할 수 있다.
 * 4.start()함수가 실행 전의 상태이므로 NEW 인 상태  
 * 5.NEW인 상태를 확인하면 조건문에 의해 start()함수가 호출되므로 getState() 받은 값은 RUNNABLE 상태
 * 6.RUNNABLE 상태에서 다른 쓰레드가 동작하므로 주어진 시간 동안 기다리는 상태인 일시정지 상태 TIMED_WAITING 
 * 7.반복문이 완료되면 실행이 완료된 상태이므로 실행을 마친 상태인 TERMINATED 상태가 표시된다.  
 */
}
