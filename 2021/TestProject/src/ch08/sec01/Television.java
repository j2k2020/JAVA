package ch08.sec01;

public class Television implements RemoteControl {
	private int volume;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

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
		System.out.println("현재 TV 볼륨:" + volume);
	}

	@Override
	public void setMaute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("TV 무음 처리함");
		} else {
			System.out.println("TV 무음 해제");
		}
	}

}
