package ch12.sec07;

/*
 * 동기화 메소드: synchronized 키워드 붙임 (lock(잠금)의 
 * 임계 영역으로 한 번에 한 스레드만 실행 가능
 * 다른 스레드는 메소드 또는 블록이 실행이 끝날 때까지 대기
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
