package ch08.sec01;

public class RemoteControlEx {
	public static void main(String[] args) {
		// �������̽� ���� ����
		RemoteControl rc = null;

		// �ڷ����� ��ü
		rc = new Television(); // �ڸ����� ��ü�� �ν��Ͻ� Ÿ�Կ� ����
		rc.turnOn(); // �߻� �żҵ� ���
		rc.setVolume(10); // �߻� �żҵ� ���
		rc.setMaute(true); // ����Ʈ �żҵ� ���
		rc.setMaute(false); // ����Ʈ �żҵ� ���
		rc.turnOff(); // �߻� �ř� ���

		System.out.println("");

		rc = new Audio(); // ����� ��ü�� �ν��Ͻ� Ÿ�Կ� ����
		rc.turnOn();
		rc.setVolume(12);
		rc.setMaute(true);
		rc.setMaute(false);
		rc.turnOff();

		System.out.println("");

		// static �żҵ� ���
		RemoteControl.changeBattery();

	}

}
