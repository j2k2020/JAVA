package ch07.sec09;

public class ChildEx {

	public static void main(String[] args) {
		//ParentŸ�� ������ Child��ü ����(����)
		Parent parent = new Child(); //�θ�Ÿ������ �ڵ� Ÿ�� ��ȯ �߻�
		
		//Parent�ɹ��� ��� ����
		parent.f1="data1";
		parent.method1();
		parent.method2();
		
		/*
		//ParentŸ������ ��ȯ�� �Ŀ��� ChildŬ������ �ɹ� ��� �Ұ� (X)
		parent.f2="data2";
		parent.method3();
		*/
		
		//�ٽ� Child Ÿ������ ��ȯ: ���� Ÿ�� ��ȯ
		Child ch = (Child)parent;
		ch.method3(); //ChildŬ���� �ɹ� ��� ����
	}

}
