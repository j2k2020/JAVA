package ch09.sec07;


public class Window {
	button btn1 = new button(); 
	button btn2 = new button();
	
	//�ʵ� �ʱⰪ���� �͸� ���� ��ü �����ؼ� ����
	button.OnClickListener listener = new button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	
	 Window() {
		btn1.setOnClickListener(listener);
		
		
		// �͸� ���� ��ü �����ؼ� �Ű������� ����
		btn2.setOnClickListener(new button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
				
			}
		});
	}

}
