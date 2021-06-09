package ch12.sec11;

/*join()메소드: 다른 스레드의 종료를 기다림
 * 실행중인 스레드를 일시 정지했다가
 * join()으로 호출한 스레드가 종료하면 
 * 다시 실행 대기 상태로 변경
 * 계산 작업을 하는 스레드가 모든 계산 작업을 마칠 때까지 기다리고 있다가
 * 계산 작업을 다 마치면 결과를 받아서 이용하는 경우 주로 사용*/

//계산 작업을 담당하는 스레드
public class SumThread extends Thread {
	private long sum;
		
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}

}
