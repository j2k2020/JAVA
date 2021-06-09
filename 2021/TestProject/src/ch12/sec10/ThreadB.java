package ch12.sec10;

public class ThreadB extends Thread{
	//중지 상태와 작업 중인 상태를 알기 위한 필드 초기화
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop){ //조건이 true이면 반복문 계속
			if(work) {
				System.out.println("ThreadB 작업 내용");
			}else {
				Thread.yield();
			}
			System.out.println("ThreadB종료");
		}
	}
	

}
