package ch08.sec08;

public class implementationC implements C {
//Interface C�� �������̽� A�� B�� ��� �޾����Ƿ� �������̽�A,B�� �߻� �޼ҵ带 �������ؼ� �޼ҵ�� �����ؾ� ��
	//�������� ������ ����
	@Override
	public void methodA() {
		System.out.println("���� implementationC �ӿ� �޼ҵ�A�Դϴ�.");

	}

	@Override
	public void methodB() {
		System.out.println("���� implementationC �ӿ� �޼ҵ�B�Դϴ�.");

	}

	@Override
	public void methodC() {
		System.out.println("���� implementationC �ӿ� �޼ҵ�C�Դϴ�.");

	}

}
