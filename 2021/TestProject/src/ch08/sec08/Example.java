package ch08.sec08;

public class Example {

	public static void main(String[] args) {
		implementationC impl = new implementationC();
		
		A interA = impl; //�ڵ� Ÿ�� ��ȯ
		//AŸ���̹Ƿ� ����� ��� ����
		System.out.println("******�������̽� A*******");
		interA.methodA(); //A�� ��� methodA()�� ȣ�� ����
		//B,C���Ұ�
		
		System.out.println("******�������̽� B*******");
		B interB = impl;
		interB.methodB();
		interA.methodA();
		
		System.out.println("******�������̽� C*******");
		C interC = impl;
		interC.methodA();
		interC.methodB();
		interC.methodC();
		interA.methodA();
		interB.methodB();

	}

}
