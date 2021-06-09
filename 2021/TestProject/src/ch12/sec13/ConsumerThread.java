package ch12.sec13;

//소비자 스래드: 테이터 읽어감(getData() 매소드 사용)
public class ConsumerThread extends Thread{
	//공유 객체 필드
	private DataBox dataBox;

	//생성자에서 초기화
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=1; i<= 3; i++) {
			String data = dataBox.getData();
		}
	}
	
	
	
	

}
