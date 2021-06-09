package ch09.sec06;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous ano = new Anonymous();
		System.out.println("1.익명 객체가 대입된 필드 사용--------------");
		ano.field.turnOn();
		ano.field.turnOff();
		
		System.out.println("2.익명 객체 로컬 변수 사용--------------");
		ano.method1();
		
		System.out.println("3.익명 객체 메개값 사용--------------");
		ano.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트TV를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트TV를 끕니다.");
				
			}
		});
		
		
		
	}

}
