package ch03.sec04;

//논리 연산자
//&& , & (AND)
// ||, | (OR)
// ! (NOT)

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 'A'; //65
		
		if((charCode >=65) & (charCode <=90)) {
			System.out.println("대문자");
		}
		if((charCode >= 97)&&(charCode <=122)) {
			System.out.println("소문자");
		}
		
		
		int charCode2 = 48;
		if( !(charCode2 < 48)&& !(charCode2 > 57)) {
			System.out.println("0~9숫자 이군요");
		}
		
		
		int value = 6;
		if((value%2==0)||(value%3==0)) {
			System.out.println("2또는 3의 배수 이군요");
		}
		

	}

}
