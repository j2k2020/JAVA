package ch07.sec09;

public class ChildEx {

	public static void main(String[] args) {
		//Parent타입 변수에 Child객체 대입(주입)
		Parent parent = new Child(); //부모타입으로 자동 타입 변환 발생
		
		//Parent맴버만 사용 가능
		parent.f1="data1";
		parent.method1();
		parent.method2();
		
		/*
		//Parent타입으로 변환된 후에는 Child클래스의 맴버 사용 불가 (X)
		parent.f2="data2";
		parent.method3();
		*/
		
		//다시 Child 타입으로 변환: 강제 타입 변환
		Child ch = (Child)parent;
		ch.method3(); //Child클래스 맴버 사용 가능
	}

}
