package Basic;

//변수의 사용 범위 : 변수는 선언된 블록 내에서만 사용이 가능하다!!

//변수는 중괄호{} 블록 내에서 선언되고 사용된다
//중괄호 블록을 사용하는 곳은 클래스,생성자,메소드
//메소드 블록 내에서 선언된 변수를 = 로컬 변수(local variable)이라 한다

public class VariableScopeEx { //클래스 블록
	public static void main(String[] args) {//메소드 블록
		
		int v1 = 15; //변수 v1에 15를 값으로 선언
		
	 	if(v1>10) { //if문시작=>조건 v1이 10보다 클 때
	 		
			int v2 = v1 -10; //v2에  v1의 값(15) -10을 한 값을 저장한다
			
		}//if문 끝
		
	 	int v3 = v1 + v2 + 5; //이 상태로 컴파일을 하면 에러가 남
		
	 	
/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			v2 cannot be resolved to a variable
		
at Basic.VariableScopeEx.main(VariableScopeEx.java:13)*/
	 	
	 	/*변수는 선언된 블록 내에서만 사용이 가능하기 때문에
	 	v2 변수를 if문 밖에서는 사용할 수 없기 때문에 컴파일 에러가 생긴다.*/

	}
}
