package ch07.sec01;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//매개변수가 있는 생성자
	void turnOnDmb() {
		System.out.println("체널:"+channel+"번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("체널:"+channel+"번 DMB방송으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("체널:"+channel+"번 DMB방송을 멈춤니다.");
	}
	

}
