package ch12.sec01;

import java.awt.Toolkit;

//메인 스레드만 존재
//두 작업을 순서대로 하나씩 실행

public class BeepPrint {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//비프음 5번 연속 출력
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {	e.printStackTrace();}
		}
		
		
		//띵 5번 연속 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	//스레드 , 람다식
	//제네릭 , ? , 입출력
	

}
