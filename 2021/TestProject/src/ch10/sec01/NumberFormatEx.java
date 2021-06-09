package ch10.sec01;

public class NumberFormatEx {
	public static void main(String[] args) {
		
		//숫자 100
		String data1="100";
		//String data2="ab1000"; //문자가 들어가서 연산 불가
		String data2="1000";
		
		//문자열을 정수로 변환
		int value1 = Integer.parseInt(data1); //Integer.parseInt로 숫자 타입의 문자열을 숫자로 변환해주는 인자
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println("결과: "+result);
		
	}

}
