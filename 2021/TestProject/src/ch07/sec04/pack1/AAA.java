package ch07.sec04.pack1;

//�ʵ�� �żҵ��� ���� ����
//Ŭ���� ���ο����� ���� ���Ѱ� ������� ��� �ʵ�� �żҵ� ��� ����

public class AAA {
	// �ʵ�
	public int field1;   // public ���� ����
	int field2;          // default ���� ����
	private int field3;  // private
	protected int field4; //protected

//Ŭ���� �����ο��� ���� Ȯ��
	public AAA() {
		// Ŭ���� ���ο��� ���� ���� ����
		field1 = 1;
		field2 = 2;
		field3 = 3;
		

		method1();
		method2();
		method3();
		
	}

//�żҵ�
	public void method1() {
	} // public

	void method2() {
	} // default

	private void method3() {
	} // private
	
	protected void method4() {}

}
