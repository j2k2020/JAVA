package ch07.sec07;

public class ChildEx {

	public static void main(String[] args) {
		Child ch = new Child();
		
		//�θ� Ŭ���� Ÿ�� ������ �ڽ� Ŭ���� ��ü�� ����
		Parent parent = ch; //�ڵ� Ÿ�� ��ȯ �߻�
		//Parent������ child��ü�� ���������� 
		//Parent�ɹ��� ��� ����
		
		//Parent �żҵ� ��� ����
		parent.method1();
		
		//Child ��ü�� ���������� Child �ɹ��� ����� �� ���� -> ȣ�� �Ұ���
		//parent.method3();  //The method method3() is undefined for the type Parent 
	    
		//������ �� Child �żҵ尡 ȣ�� ��
		parent.method2();
		//Parent Ÿ���̹Ƿ� Parent Ŭ������ method2()�� �����Ϸ��� ���ϱ� ChildŬ������ ������ �Ǿ� �ִ� ���� Ȯ��
		//�׷��� �θ� �ɹ��� ȣ������ �ʰ�, �ڽĿ� �����ǵ� �ɹ� �żҵ带 ȣ����.
   		

	}

}
