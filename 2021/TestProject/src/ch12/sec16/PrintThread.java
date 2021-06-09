package ch12.sec16;

public class PrintThread extends Thread {

	@Override
	public void run() {
		// 무한 반복

		//방법1
		/*
		while (true) {
			System.out.println("실행 중");
			// 일시 정지 상태 없는 경우
		
			 //* interrupt된 상태인지를 확인하고 
			// * interrupt되었으면 종료 
			// * interrupted()매소드 또는 isInterrrupted()매소드 사용
			
			//Thread.interrupted(): interrupted()는 Thread의 정적 매소드
			
			if (Thread.interrupted()) { // interrupt되었으면
				break; // while문 종료
			}
		}
	*/
		
		
		
		//방법2
		//isInetrrupted()매소드 사용
		//Thread 클래스의 인스턴스 매소드 isInterrupted()사용
		while (true) {
			System.out.println("실행 중");
			if (isInterrupted()) { // interrupt되었으면
				break; // while문 종료
			}
		}

		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
