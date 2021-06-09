package ch07.sec01;

public class EmpManager {

	public static void main(String[] args) {
		Manager mg = new Manager(); // 인스턴스 객체 하나 생성
		mg.setManager();
		mg.showManagerInfo();

		/*
		 * 출력 값 
		 * 
		 * 사번: 4 
		 * 성명: 5 
		 * 부서: 6 
		 * -> 사번~부서는 부모 클래스에서 자식 클래스가 상속 받아 옴
		 
		 * 직위: 부사장 
		 * -> 자식 클래스 자신이 가지고 있는 데이터 출력  
		 
		 */

	}

}
