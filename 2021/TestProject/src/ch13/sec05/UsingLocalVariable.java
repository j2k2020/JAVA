package ch13.sec05;

/*람다식에서 매소드의 매개변수 또는 로컬 변수는 final특성을 가져야 하나
 * final 키워드도 생략해도 final특성(JAVA8로부터)*/

public class UsingLocalVariable {
	//매개변수를 기준 매소드
	void method(int arg) { //매개변수 arg는 final 특성을 가짐
		int localVar = 40;  //로컬변수 localVar는 final
		
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: "+ arg);
			System.out.println("localVar: "+ localVar + "\n");
			
		};
		fi.method();
	}

}
