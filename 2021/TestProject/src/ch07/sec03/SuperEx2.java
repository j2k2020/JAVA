package ch07.sec03;

//super���۶��� or Ŭ����

class SuperClass2 {
	int x;

	/*
	 * public SuperClass() { x = 5; }
	 */
}

class SubClass2 extends SuperClass2 {
	// int x;
	public SubClass2() {
		x = 10;
	}

	public void show() {
		// this.x: �ڽ��� Ŭ���� �� ��ü, �ڽ� �ʵ� x
		System.out.println("this.x: " + this.x);

		// super.x: �θ� Ŭ������ �ɹ� �ʵ� x
		System.out.println("super.x: " + super.x);
	}
}

public class SuperEx2 {

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.show();
		/*
		 * this.x: 10 super.x: 5
		 */

		SubClass2 sub2 = new SubClass2();
		sub2.show();
		/*
		 * this.x: 10 super.x: 10
		 */

	}

}
