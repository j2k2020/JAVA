package ch13.sec03;

//리턴값이 있는 람다식
//매개값 2,5를 전달하고, 2+5한 결과를 리턴하는 람다식 작성
//결과 받아서 출력

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x,y) -> {
			int result = x+y;
			return result;
		};
		
		int result = fi.method(2,5);
		System.out.println(result);
		
		System.out.println(fi.method(2,5));

	}
}
