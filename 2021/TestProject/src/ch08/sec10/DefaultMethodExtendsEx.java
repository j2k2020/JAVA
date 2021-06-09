package ch08.sec10;

public class DefaultMethodExtendsEx {

	public static void main(String[] args) {
		//익명 구현 객체를 생성해서 인터페이스 변수에 대입
		childInterface1 ci1 = new childInterface1() {
			
			//오버라이드 재정의
			
			@Override
			public void method1() {
				System.out.println("childInterface1에서 재정의된 method1()");
			}
			
			@Override
			public void method3() {
				System.out.println("childInterface1에서 재정의된 method3()");	
			}
			
			//디폴트 메소드는 재정의는 하지 않음
		};
		
		System.out.println("----------- ChildInterface1 -----------");
		ci1.method1(); //추상 메소드
		ci1.method2(); //디폴트 메소드
		ci1.method3(); //추상 메소드
		System.out.println(" ");
		
		//------------------------------------------------------------------------
		
		//익명 구현 객체를 생성해서 인터페이스 변수에 대입
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface2에서 재정의된 method1()");	
			}
			
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2에서 재정의된 method3()");		
			}
		};
		System.out.println("----------- ChildInterface2 -----------");
		ci2.method1(); //추상 메소드
		ci2.method2(); //디폴트 메소드
		ci2.method3(); //추상 메소드
		System.out.println(" ");
		
		
		
		
		//------------------------------------------------------------------------
		
				//익명 구현 객체를 생성해서 인터페이스 변수에 대입
				ChildInterface3 ci3 = new ChildInterface3() {
					
					@Override
					public void method1() {
						System.out.println("ChildInterface3에서 재정의된 method1()");	
					}
					
					
					@Override
					public void method2() {
						System.out.println("ChildInterface3에서 재정의된 method2()");	
						
					}


					@Override
					public void method3() {
						System.out.println("ChildInterface2에서 재정의된 method3()");		
					}
				};
				System.out.println("----------- ChildInterface3 -----------");
				ci3.method1(); //추상 메소드
				ci3.method2(); //디폴트 메소드
				ci3.method3(); //추상 메소드
				System.out.println(" ");
		

	}

}




















