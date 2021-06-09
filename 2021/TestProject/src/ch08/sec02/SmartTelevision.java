package ch08.sec02;

public class SmartTelevision implements RemoteControl, Serchable {
	private int volume;

	@Override
	public void search(String url) {
		System.out.println("URL�ּҴ�: "+url);

	}

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����:" + volume);
	}

}
