package ch08.sec09;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB�ӿ�) MyClassB���� ������-method1(1) ����");
	}

	//MyInerface�� �޼ҵ� ������
	//�߻� �޼ҵ�� �ʼ��� ������ �ؾ� ��(�� �ϸ� ����)
	//����Ʈ �޼ҵ�� ���������� ������ �� �� ����(�� �ص� ���� ����)
	
	//default �޼ҵ� ������
	@Override
	public void method2() {
		System.out.println("MyClassB�ӿ�) MyClassB���� ������ (����Ʈ �޼ҵ�)-method2()����");
	}
	
	

}
