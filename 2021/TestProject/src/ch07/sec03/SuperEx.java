package ch07.sec03;

//super���۶��� or Ŭ����

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
		//this.x: �ڽ��� Ŭ���� �� ��ü, �ڽ� �ʵ� x
		System.out.println("this.x: "+ this.x);
		
		//super.x: �θ� Ŭ������ �ɹ� �ʵ� x
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
