package ch12.sec03;

public class ThreadNameEx {
	public static void main(String[] args) {
		//���� ���� ���� Ŭ���� Ȯ��
		Thread maInThread = Thread.currentThread(); //static �޼ҵ�
		System.out.println("���α׷� ���� ������ �̸�:"+maInThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�:"+threadA.getName());
		threadA.start(); //run()�޼ҵ� ȣ��
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�:"+threadB.getName());
		threadB.start(); //run()�޼ҵ� ȣ��
	}
	

}