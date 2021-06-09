package ch13.sec04;

public class UsingThis {
	public int outterField = 10;
	public int field = 100;

	class Inner {
		int innerField = 20;
		int field = 200;

		void method() {
			// ¶÷´Ù½Ä
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				System.out.println("innerField: " + innerField);

				System.out.println("outterField: " + field);
				System.out.println("outterField: " + field);

				System.out.println("outterField: " + UsingThis.this.field);

				System.out.println("outterField: " + this.field);
			};
			fi.method();
		}

	}
}
