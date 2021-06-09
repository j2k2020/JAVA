package ch10.sec01;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}
		catch(ClassNotFoundException e){
		        System.out.println("클래스가 존재하지 않음!");	
		}
		
		
		
		String data1="100";
		String data2="ㅇ1000";
		try {
		//문자열을 정수로 변환
		int value1 = Integer.parseInt(data1); //Integer.parseInt로 숫자 타입의 문자열을 숫자로 변환해주는 인자
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println("결과: "+result);
		
		}
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("종료합니다.");
		}
		
		

	}

}
