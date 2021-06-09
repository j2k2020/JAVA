package ch12.sec05;

public class ThreadPrlorlty {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//랜덤으로 값(숫자)가 출력
//			Thread thread = new CalcThread("thrad:"+i);
//			thread.start();
			
			
			Thread thread = new CalcThread("thrad:"+i);
			
			if(i != 10) { //i가 10이 아니면
			thread.setPriority(Thread.MIN_PRIORITY);
		}else {
			thread.setPriority(Thread.MAX_PRIORITY);
		}
			
			thread.start();
			
		}
	}

}
