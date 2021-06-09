package ch10.sec01;

public class MultiCatch {

	public static void main(String[] args) {
		
		
		String data11="100";
		String data21="1000";
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			
			System.out.println("args 0: "+data1);
			System.out.println("args 1: "+data2);
			
			
			
			int value1 = Integer.parseInt(data11); //Integer.parseInt로 숫자 타입의 문자열을 숫자로 변환해주는 인자
			int value2 = Integer.parseInt(data21);
			
			int result = value1 + value2;
			System.out.println("결과: "+result);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위가 벗어난 예외는 여기서 처리하겠다");
		}catch (NumberFormatException e) {
			System.out.println("숫자 형식이 잘 못되서 발생한 예외는 여기서 처리하겠다");
		}
	}

}
