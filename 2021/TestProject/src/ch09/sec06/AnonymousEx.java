package ch09.sec06;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous ano = new Anonymous();
		System.out.println("1.�͸� ��ü�� ���Ե� �ʵ� ���--------------");
		ano.field.turnOn();
		ano.field.turnOff();
		
		System.out.println("2.�͸� ��ü ���� ���� ���--------------");
		ano.method1();
		
		System.out.println("3.�͸� ��ü �ް��� ���--------------");
		ano.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("����ƮTV�� �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("����ƮTV�� ���ϴ�.");
				
			}
		});
		
		
		
	}

}
