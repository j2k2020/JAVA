package ch07.sec01;

//Child클래스는 Parent클래스로부터 상속 받음
//키워드 extends사용
public class Child extends Parent{
	//Child 클래스의 필드
	private int c;
	
	public void setChild() {
		c =20;
	}
	
	public void showChild(){
		//Child클래스는 Parent클래스로부터 상속을 받았기 때문에 
		//Parent클래스의 메소드 사용 가능
		showParent(); //부모 클래스의 메소드
		System.out.println("자식 클래스c:"+c); //자식 자신의 메소드
	}

}
