package ch12.sec14;

//안전한 종료를 위해 stop플레그 이용
//stop 플래그로run()매소드의 정상 종료 유도
//run()매소드가 종료되면 스레드 종료
//stop 값이 true 또는 false상태인지 확인해서 종료하는 방법
public class PrintThread extends Thread {
	private boolean stop;
	
	//외부에서 stop값 변경 가능
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) { //조건이 true인 while문 종료(stop이 true인 경우)
			System.err.println("실행 중");
		}
		System.err.println("자원 정리");
		System.err.println("실행 종료");
	}
	
	
	

}
