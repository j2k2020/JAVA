package ch13.sec06;

public class RunnableEx {

	public static void main(String[] args) {
		//스레드가 실행하는 코드를 람다식으로 표현
		/*Runnable runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();*/
		
		
		//람다식을 이용해서 Runnable 인스턴스 생성
		//Thread 생성자 호출 시 라다식을 매개값으로 대입
		
		Thread thread = new Thread(() -> {
			for(int i=0; i<10; i++) {System.out.println(i);}
		});
		
		thread.start();
		
	}
} //End calss
