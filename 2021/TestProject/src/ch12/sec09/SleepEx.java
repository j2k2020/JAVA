package ch12.sec09;

import java.awt.Toolkit;

/*main 스레드가 시행 상태에서 for문 실행
 * 1초간 일시 정지 상태로 갔다가 -> 실행 대기 상태로 변경 -> 실행상태*/

//1초 간격으로 비프음과 beep출력 (1초는 음이 울리기엔 너무 빠르다;;;난 3초가 좋더라)

public class SleepEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			System.out.println("beep");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
