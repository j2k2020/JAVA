package ch07.sec11;

public class Cat extends Animal {
	public Cat() {
		this.kind="������";
	}
	
	//�߻� �żҵ� ������
	//�ʼ�
	//Ŭ���� ���� �� �ڵ� ���ԵǾ� ����
	@Override
	public void sound() {
		System.out.println("�߿�");
		
	}

}
