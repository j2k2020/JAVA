package ch08.sec10;

//�θ� �������̽��� ����Ʈ �޼ҵ带 �ڽ� �������̽����� Ȱ���ϴ� ��� 
//2.����Ʈ �޼ҵ带 ������(Override)�ؼ� ���� ������ �����ؼ� ���      ----childInterface2

public interface ChildInterface2 extends ParentInterface {

	@Override
	default void method2() {
		System.out.println("ChildInterface2���� �����ǵ� ����Ʈ �޼ҵ� method2() ����");
	}
	
	public void method3();
	
	

}
