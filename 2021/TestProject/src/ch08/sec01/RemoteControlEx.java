package ch08.sec01;

public class RemoteControlEx {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc = null;

		// 텔레비전 개체
		rc = new Television(); // 텔리비전 객체를 인스턴스 타입에 대입
		rc.turnOn(); // 추상 매소드 사용
		rc.setVolume(10); // 추상 매소드 사용
		rc.setMaute(true); // 디폴트 매소드 사용
		rc.setMaute(false); // 디폴트 매소드 사용
		rc.turnOff(); // 추상 매솓 사용

		System.out.println("");

		rc = new Audio(); // 오디오 객체를 인스턴스 타입에 대입
		rc.turnOn();
		rc.setVolume(12);
		rc.setMaute(true);
		rc.setMaute(false);
		rc.turnOff();

		System.out.println("");

		// static 매소드 사용
		RemoteControl.changeBattery();

	}

}
