package ch14.sec02;

import java.util.function.IntSupplier;

//supplier 함수적 인터페이스
//매개값은 없고 리턴값만 있는 추상 매소드 가짐

public class SupplierEx {
	public static void main(String[] args) {
		//int값 리턴 람다식
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random() *6) + 1;
			return num;
		};
		
		//추상 매소드 호출해서 결과값 저장
		int num = intSupplier.getAsInt();
		System.out.println(num);
		

	}

}
