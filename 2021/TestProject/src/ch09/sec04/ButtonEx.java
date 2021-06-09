package ch09.sec04;

public class ButtonEx {

	public static void main(String[] args) {
		//Button ��ü�� ����
		Button btn = new Button();
		
		//Button�� Setterȣ���ؼ� ����
		btn.setOnClickListener(new CallListener());
		
		//��ư Ŭ�� ��, ȣ��Ǵ� �޼ҵ� ȣ��-��ư Ŭ���� �̺�Ʈ ó��
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		System.out.println("------------2��° ���-------------");
		CallListener call = new CallListener();
		btn.setOnClickListener(call);
		btn.touch();
		
		MessageListener msg= new MessageListener();
		btn.setOnClickListener(msg);
		btn.touch();
		
		System.out.println("------------�͸� ���� ��ü ���-------------");
		//�͸� ���� ��ü ���(���� Ŭ���� �������� �ʰ�)
		//���� Ŭ������ ������ �ʰ�, ���� �͸� ���� ��ü�� �����ؼ� �̺�Ʈ ó���� �ϴ� ��찡 �� ����
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�!!");
				
			}
		});
		btn.touch();
		

	}

}
