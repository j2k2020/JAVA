package ch09.sec02;

//로컬 클래스에서 사용 제한
//로컬 클래스: 메소드 내부에서 선언된 클래스
//메소드의 매개변수나 로컬 변수는 final로 선언해야 함
//자바8 이후

public class Outter {
	public void method(final int arg1, int arg2) { //매개변수 (final 붙인 것 / 안 붙인 것 = 차이점 비교)
		final int localVariable1 = 1;
		
		//final 붙으면 변경 불가
		//arg1 = 100; //변경 불가
		//localVariable1 = 100; //변경불가
		//arg2 = 200; //final이 안 붙었으므로 메소드 내에서 로컬 변수로 지정 //변경 가능
		            //final 특성이 없음
		            //arg2 = 지역변수 처럼 사용 됨
		//여기서 arg2를 사용하지 않으면 Inner클래스에서 사용 가능
		
		class Inner{
			//arg2가 여기로 복사 되는 것 (final 특성을 갖고)
			public void method() {
				int result = arg1 + localVariable1 + arg2; //Local variable arg2 defined in an enclosing scope must be final or effectively final
				//arg2: 로컬 클래스 내부로 복사되어 
				//final특성을 가짐 //오류 없음
				
				System.out.println(result);
			}
		}
		
	}

}
