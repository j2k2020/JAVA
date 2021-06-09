package ch12.sec05;

public class CalcThread extends Thread{
	//생성자에게서 매개값으로 스레드 이름 설정
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<2000000000; i++) {
			//반복만 돌릴것
		}System.out.println(getName());
	}

}
