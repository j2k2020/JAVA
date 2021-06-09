package ch07.sec01;

public class inheritance {

	public static void main(String[] args) {
		// Child 클래스의 인스턴스(객체) 생성
		Child ob = new Child();

		// set을 해야지만 값을 넣을 수 있음
		ob.setChild();
		ob.setParent();
		ob.showChild(); // 자식 클래스의 메소드만 불러옴.
		/*
		 * 출력 부모 클래스의 p:10 자식 클래스c:20 자식이 부모의 메소드를 상속 받았기에 부모 클래스의 출력문도 같이 나온다.
		 */

	}

}
