package ch09.sec07;

//Button�̺�Ʈ ó������ �͸� ���� ��ü ���

public class button {
	// �ʵ�
	OnClickListener listener;

	// setter �޼ҵ�� ���� ��ü�� �޾� �ʵ忡 ����
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// ��ư �̺�Ʈ�� �������� �� ȣ��Ǵ� �޼ҵ�
	void touch() {
		listener.onClick();
	}

	// ��ø �������̽� - ��ư������ ��� �� ����
	interface OnClickListener {
		void onClick();
	}

}
