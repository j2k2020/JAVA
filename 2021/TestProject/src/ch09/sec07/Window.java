package ch09.sec07;


public class Window {
	button btn1 = new button(); 
	button btn2 = new button();
	
	//필드 초기값으로 익명 구현 객체 생성해서 대입
	button.OnClickListener listener = new button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	
	 Window() {
		btn1.setOnClickListener(listener);
		
		
		// 익명 구현 객체 생성해서 매개값으로 대입
		btn2.setOnClickListener(new button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
				
			}
		});
	}

}
