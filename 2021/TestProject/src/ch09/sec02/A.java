package ch09.sec02;

public class A {
	//�ν��Ͻ� �ʵ� �ʱ�ȭ
	B filed1 = new B(); //�ʵ��� �ʱⰪ���� ��ü ���� �� �ʱⰪ���� ��� ����
	C filed2 = new C(); // staticŬ���� ��ü ���� �� �ʱⰪ�� ��� ����
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B(); //�ν��Ͻ� �޼ҵ� ������ ��ü ���� �� �ʱⰪ���� ��� ����
		C var2 = new C(); //�ν��Ͻ� �޼ҵ� ������ static Ŭ���� ���� �� �ʱⰪ�� ��� ����
	}
	
	//static �ʵ� �ʱ�ȭ
	//static B filed3 = new B(); //�ν��Ͻ� ��� Ŭ���� B�� static �ʵ� �ʱ�ȭ�� ��� �Ұ�
	static C field4 = new C(); //����
	
	//static �޼ҵ� �ʱ�ȭ
	static void method2() {
		 // B var1 = new B(); //static ��� Ŭ�������� �ν��Ͻ� ��� Ŭ���� B�� �ʱ�ȭ �Ұ�
		C var2 = new C();
	}
	
	
	class B { }
	
	static class C{}

}
