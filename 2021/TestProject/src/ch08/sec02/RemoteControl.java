package ch08.sec02;

public interface RemoteControl {
	// 상수 필드 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 매소드 선언
	// 추상 매소드:선언만 하고, 바디가 없는 매소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 매소드 선언: 실행 블록을 가지고 있는 매소드
	// 디폴트 붙어야 함
	default void setMaute(boolean mute) {
		if (mute) { // if(mute == true)
			System.out.println("무음 처리함");
		} else {
			System.out.println("무음 해제");
		}
	}

	// static 매소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다!! 잠깐 쉬고 갈께요ㅋㅋ");
	}
}
