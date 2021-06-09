package ch09.sec04;

//��ø �������̽�: Ŭ������ ����� ����� �������̽�

public class Button {
	//�ʵ�
	//�������̽� Ÿ������ �ʵ� ����
	OnClickListener listener;
	
	//�޼ҵ�
	//Setter �޼ҵ�� ���� ��ü�� �Ű������� ���� �޾Ƽ� �ʵ忡 ����
	void setOnClickListener(OnClickListener listener) { //�Ű����� ������(�Ű������� �������̽��̸� �پ��� ���� ��ü�� ���� �� ����)
		this.listener = listener;
	}
	
	//�޼ҵ�: ��ư �̺�Ʈ�� �߻����� �� ȣ��Ǵ� �޼ҵ�
	void touch() {
		//�������̽��� ���� ���� ��ü�� �޼ҵ带 ȣ��
		listener.onClick();
	}
	
	
	
	//��ø �������̽�: Button Ŭ���� ���ο� ����
	//�ٱ� Ŭ������ ������ ���谡 �ְ�, Ŭ���� �ܺο����� ������� �ʰ�, Button������ ����ϹǷ� ��ø �������̽� ����
	interface OnClickListener{
		void onClick(); //�߻� �޼ҵ�
	}

}
