package ch07.sec05;

public class MyCar {
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	//final �żҵ�� ������(�������̵�) �� ��
	public final void stop() {
		System.out.println("�ڵ� ����");
		speed = 0;
	}

}
