package ch15.sec04;

public class BoxingMethodEx {

	public static void main(String[] args) {
		// 방법1: 호출할 때 구체적 타입 명시
		Box<Integer> box = Util.<Integer>boxing(100);
		int intValue = box.getT();
		System.out.println(intValue);
		
		
		// 방법2: 호출 시 구체적 타입 생략
		// 매개값을 보고 구체적 타입을 추정
		Box<String> box2 = Util.boxing("홍길동"); // <String>생략
		String strValue = box2.getT();
		System.out.println(strValue);

	}

}
