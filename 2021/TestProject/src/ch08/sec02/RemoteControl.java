package ch08.sec02;

public interface RemoteControl {
	// ��� �ʵ� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// �߻� �żҵ� ����
	// �߻� �żҵ�:���� �ϰ�, �ٵ� ���� �żҵ�
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// ����Ʈ �żҵ� ����: ���� ����� ������ �ִ� �żҵ�
	// ����Ʈ �پ�� ��
	default void setMaute(boolean mute) {
		if (mute) { // if(mute == true)
			System.out.println("���� ó����");
		} else {
			System.out.println("���� ����");
		}
	}

	// static �żҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�!! ��� ���� �����䤻��");
	}
}
