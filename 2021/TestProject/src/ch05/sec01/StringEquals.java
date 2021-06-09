package ch05.sec01;

public class StringEquals {

	public static void main(String[] args) {
	    
		String strVar1 ="홍길동";
		String strVar2 ="홍길동";
		
		//동일한 객체를 참조하는지 조사
		if(strVar1==strVar2) {
			System.out.println("1과 2는참조가 같음");
		}else {
			System.out.println("1과 2는 참조가 다름");
		}
		//문자열이 같은지 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("1과 2는 문자열의 길이가 같음");
		}
		
		
		String strVar3 =new String("홍길동");
		String strVar4 =new String("홍길동");
		
		//동일한 객체를 참조하는지 조사
		if(strVar3==strVar4) {
			System.out.println("3과 4는참조가 같음");
		}else {
			System.out.println("3과 4는 참조가 다름");
		}
		//문자열이 같은지 비교
		if(strVar3.equals(strVar4)) {
			System.out.println("3과 4는 문자열의 길이가 같음");
		}

	}

}
