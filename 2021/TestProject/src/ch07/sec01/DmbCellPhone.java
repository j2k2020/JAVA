package ch07.sec01;

public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�Ű������� �ִ� ������
	void turnOnDmb() {
		System.out.println("ü��:"+channel+"�� DMB��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ü��:"+channel+"�� DMB������� �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("ü��:"+channel+"�� DMB����� ����ϴ�.");
	}
	

}
