package ch07.sec10;

public class InstanceOfEx {

	//���� Child ��ü�� Parent Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���
	//�ٽ� Child Ÿ������ ���� Ÿ�� ��ȯ
	//�����ϱ� ���� ��ü Ÿ���� Ȯ���ؼ� ���ܰ� �߻����� �ʰ� �ϴ� �żҵ�
	public static void method1(Parent parent) {
		// ������ ��ü�� �������� �ν��Ͻ��̸� true
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("�żҵ�1-Child��ȯ ����");
		} else {
			System.out.println("�żҵ�1-Child��ȯ���� ����");
		}
	}

	//���� Child ��ü�� Parent Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���
	//�ٽ� Child Ÿ������ ���� Ÿ�� ��ȯ
	//�����ϱ� ���� ��ü Ÿ���� Ȯ������ ����
	//Parent ��ü �� ������ �׳� ���� Ÿ�� ��ȯ�� �����ϴٰ� ���� �߻�
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("�żҵ�2-Child��ȯ ����");

	}

	public static void main(String[] args) {
		//���� Ÿ�� ��ȯ�� ������ parentA
		Parent parentA = new Child();
		method1(parentA); //��ü Ÿ�� Ȯ�� �� ����
		method2(parentA); //��ü Ÿ�� Ȯ������ �ʰ� ����
		
		//���� Ÿ�� ��ȯ�� ������ parentB
		Parent parentB = new Parent();
		method1(parentB); //��ü Ÿ�� Ȯ�� �� ���� - ����� �ƴ�(��ȯ���� ����)
		method2(parentB); //���ܹ߻� Parant�� ��ȯ �� �� ����  //��ü Ÿ�� Ȯ������ �ʰ� ���� - ����� �ƴϴϱ� �״�� ���� �߻�

	}

}
