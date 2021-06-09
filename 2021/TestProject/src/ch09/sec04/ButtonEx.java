package ch09.sec04;

public class ButtonEx {

	public static void main(String[] args) {
		//Button 객체를 생성
		Button btn = new Button();
		
		//Button의 Setter호출해서 설정
		btn.setOnClickListener(new CallListener());
		
		//버튼 클릭 시, 호출되는 메소드 호출-버튼 클릭시 이벤트 처리
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		System.out.println("------------2번째 방법-------------");
		CallListener call = new CallListener();
		btn.setOnClickListener(call);
		btn.touch();
		
		MessageListener msg= new MessageListener();
		btn.setOnClickListener(msg);
		btn.touch();
		
		System.out.println("------------익명 구현 객체 사용-------------");
		//익명 구현 객체 사용(구현 클래스 생성하지 않고)
		//구현 클래스를 만들지 않고, 직접 익명 구현 객체를 대입해서 이벤트 처리를 하는 경우가 더 많음
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다!!");
				
			}
		});
		btn.touch();
		

	}

}
