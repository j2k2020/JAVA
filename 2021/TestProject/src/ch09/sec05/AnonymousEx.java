package ch09.sec05;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous ano = new Anonymous();
		
		
		System.out.println("-------�͸� ��ü �ʵ� ���------");
		ano.field.wake();
		//wake(): �θ� Ÿ���� �����ǵ� �޼ҵ�� field�ʵ� ����ؼ� �ܺο��� ȣ�� ����
		
		System.out.println("-------�͸� ��ü ���� ���� ���------");
		ano.method1();
		
		
		System.out.println("-------�Ű������� �͸� �ڽ� ��ü ���------");
		ano.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});

	}

}
