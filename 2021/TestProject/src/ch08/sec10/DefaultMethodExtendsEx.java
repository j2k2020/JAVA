package ch08.sec10;

public class DefaultMethodExtendsEx {

	public static void main(String[] args) {
		//�͸� ���� ��ü�� �����ؼ� �������̽� ������ ����
		childInterface1 ci1 = new childInterface1() {
			
			//�������̵� ������
			
			@Override
			public void method1() {
				System.out.println("childInterface1���� �����ǵ� method1()");
			}
			
			@Override
			public void method3() {
				System.out.println("childInterface1���� �����ǵ� method3()");	
			}
			
			//����Ʈ �޼ҵ�� �����Ǵ� ���� ����
		};
		
		System.out.println("----------- ChildInterface1 -----------");
		ci1.method1(); //�߻� �޼ҵ�
		ci1.method2(); //����Ʈ �޼ҵ�
		ci1.method3(); //�߻� �޼ҵ�
		System.out.println(" ");
		
		//------------------------------------------------------------------------
		
		//�͸� ���� ��ü�� �����ؼ� �������̽� ������ ����
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface2���� �����ǵ� method1()");	
			}
			
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2���� �����ǵ� method3()");		
			}
		};
		System.out.println("----------- ChildInterface2 -----------");
		ci2.method1(); //�߻� �޼ҵ�
		ci2.method2(); //����Ʈ �޼ҵ�
		ci2.method3(); //�߻� �޼ҵ�
		System.out.println(" ");
		
		
		
		
		//------------------------------------------------------------------------
		
				//�͸� ���� ��ü�� �����ؼ� �������̽� ������ ����
				ChildInterface3 ci3 = new ChildInterface3() {
					
					@Override
					public void method1() {
						System.out.println("ChildInterface3���� �����ǵ� method1()");	
					}
					
					
					@Override
					public void method2() {
						System.out.println("ChildInterface3���� �����ǵ� method2()");	
						
					}


					@Override
					public void method3() {
						System.out.println("ChildInterface2���� �����ǵ� method3()");		
					}
				};
				System.out.println("----------- ChildInterface3 -----------");
				ci3.method1(); //�߻� �޼ҵ�
				ci3.method2(); //����Ʈ �޼ҵ�
				ci3.method3(); //�߻� �޼ҵ�
				System.out.println(" ");
		

	}

}




















