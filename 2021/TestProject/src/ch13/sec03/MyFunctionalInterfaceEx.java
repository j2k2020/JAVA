package ch13.sec03;

//���ϰ��� �ִ� ���ٽ�
//�Ű��� 2,5�� �����ϰ�, 2+5�� ����� �����ϴ� ���ٽ� �ۼ�
//��� �޾Ƽ� ���

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x,y) -> {
			int result = x+y;
			return result;
		};
		
		int result = fi.method(2,5);
		System.out.println(result);
		
		System.out.println(fi.method(2,5));

	}
}
