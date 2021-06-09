package ch13.sec05;

/*���ٽĿ��� �żҵ��� �Ű����� �Ǵ� ���� ������ finalƯ���� ������ �ϳ�
 * final Ű���嵵 �����ص� finalƯ��(JAVA8�κ���)*/

public class UsingLocalVariable {
	//�Ű������� ���� �żҵ�
	void method(int arg) { //�Ű����� arg�� final Ư���� ����
		int localVar = 40;  //���ú��� localVar�� final
		
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: "+ arg);
			System.out.println("localVar: "+ localVar + "\n");
			
		};
		fi.method();
	}

}
