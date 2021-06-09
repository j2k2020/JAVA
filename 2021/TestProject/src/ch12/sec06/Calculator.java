package ch12.sec06;

/*
 * us1이 값을 100으로 설정하고 2초 대기 상태 중에
 * user2가 값을 50으로 변경할 경우
 * user1이 설정한 값 100이 아닌 변경된 값 50이 출력되는 문제
 * */

public class Calculator{ //클래스
	private int memorey; //필드
	
	public int getMemory() {
		return memorey;
	}

	public void setMemorey(int memorey) {
		this.memorey = memorey;
	try {
		Thread.sleep(2000); //2초간 정지
	}catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memorey);
	}
}
