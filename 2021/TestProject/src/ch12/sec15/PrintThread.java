package ch12.sec15;

public class PrintThread extends Thread{

	@Override
	public void run() {
		//무한 반복
		try {
			while (true) {
				System.out.println("실행 중");
				//일시 정지 상태가 없으면 interrupt()를 호출해도 정지 않됨
				Thread.sleep(1); //일시 정지 상태
				//interrupt()호출 시 예외 발생
			}
		} catch (InterruptedException e) {}
		
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
