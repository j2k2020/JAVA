package ch12.sec12;

public class WaltNotIfyEx {

	public static void main(String[] args) {
		//공유 객체 생성
		WorkObject sharObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharObject);
		ThreadB threadB = new ThreadB(sharObject);
		
		threadA.start();
		threadB.start();
		
		
	}

}
