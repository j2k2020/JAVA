package ch12.sec03;

public class ThreadNameEx {
	public static void main(String[] args) {
		//현재 실행 중인 클래스 확인
		Thread maInThread = Thread.currentThread(); //static 메소드
		System.out.println("프로그램 시작 스레드 이름:"+maInThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름:"+threadA.getName());
		threadA.start(); //run()메소드 호출
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름:"+threadB.getName());
		threadB.start(); //run()메소드 호출
	}
	

}
