package ch07.sec03;

//super레퍼란스 or 클래스

class SuperClass{
	int x;
	
	public SuperClass() {
		x = 5;
	}
}


class SubClass extends SuperClass{
	int x;
	public SubClass() {
		x = 10;
	}
	public void show() {
		//this.x: 자신의 클래스 내 객체, 자신 필드 x
		System.out.println("this.x: "+ this.x);
		
		//super.x: 부모 클래스의 맴버 필드 x
		System.out.println("super.x: "+super.x);
	}
}



public class SuperEx {

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub); //ch07.sec03.SubClass@15db9742
		
		sub.show(); //this.x: 10  //super.x: 5


	}

}
