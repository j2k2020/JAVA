package ch08.sec09;

public interface MyInterface {
	public void method1(); //�߻� �޼ҵ�
	//���ο� �޼ҵ� �߰� �ʿ�
	//cntkd apthemfh cnrkgkaus rlqhsdp �� �������̽��� ������ Ŭ��������
	//���� �߰��� ��� �߻� �޼ҵ带 �������ؾ� ��(�� �ϸ� ����)
	//public void method2(); //�߻� �޼ҵ带 �߰����� �ʰ�
	
	//����Ʈ �޼ҵ� �߰�
	//����Ʈ �޼ҵ�� �ٵ� ����
	public default void method2() {
		System.out.println("MyInferface-method2()����");
	}

}
