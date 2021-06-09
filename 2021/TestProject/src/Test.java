import java.util.zip.Deflater;

//클래스명과 동일한 파일명 생성
//대소문자 구분
//클래스 이름은 대문자로 시작
//입력한 클래스 이름으로 java 파일 생성
//파일명은 파일이름.확장자 -> 클래스이름.java
public class Test {
	public static void main(String[] args) {
	//public 오픈 . 객체를 사용. 알아서 끝. main을 (String[]값 args매개변수)
		System.out.println("test 입니다");
		//static 은 객체가 없이도 자바 가상 호출 가능)
//		한줄 주석 ctrl + /
		
		/* 주석을 원하는 드래그 하고 
		 * 여러줄 주석은 처리 ctrl+shift +/ 해지ctrl+shift +\ */
		
		//블록 주석처리 시 자동 정렬 해제
		//window / propertes 
		//java / code style / Formmater
		//Edit /new : 새이름 입력
		//Comments: Enable block comment formtting 해제
		
		
		/*//변수를 선언하는 이유
		//- 실행 중에 필요한 공간을 할당 받기 위해
		//변수는 왼쪽 값은 오른쪽 -> 항상 대입은 오른쪽에서 왼쪽으로 
		*/		
		//
		int defort;
		int total;
		int kor;
		int average;
		average=100;
		System.out.println(average+"점입니다~^^!!!!");
		char alphabet;
		alphabet = 'B';
		System.out.println("알파벳: "+alphabet);
		
		
		
	}
}
