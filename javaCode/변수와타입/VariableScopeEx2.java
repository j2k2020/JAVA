package Basic;

//변수의 사용 범위 : 변수는 선언된 블록 내에서만 사용이 가능하다!!

public class VariableScopeEx2 { //클래스 블록
	public static void main(String[] args) {//메소드 블록
		
		int v1 = 15; //변수 v1에 15를 값으로 선언
		int v2 = 0; //v2 변수를 if문 밖에 선언해서 사용한다
		
	 	if(v1>10) { //if문시작=>조건 v1이 10보다 클 때
	 		
			v2 = v1 -10; //v2에  v1의 값(15) -10을 한 값을 저장한다
			
		}//if문 끝
		 
	 	int v3 = v1 + v2 + 5;
	 	
	 	System.out.println("출력 예상 값은 25입니다. 정답이 맞나요?");
	 	System.out.println("정답은: "+v3+"입니다!"); //v3의 값을 컴파일해서 출력하기
	 	
	 	//출력은
	 	
//	 	출력 예상 값은 25입니다. 정답이 맞나요?
//	 	정답은: 25입니다!

	}
}
