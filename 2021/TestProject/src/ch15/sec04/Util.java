package ch15.sec04;

//���׸� �żҵ带 �����ϴ� Ŭ����
//���׸� �żҵ�: �Ű����� Ÿ�԰� ���� Ÿ������ Ÿ�� �Ķ���͸� ���� �żҵ�
//public <Ÿ���Ķ����> ����Ÿ�� �żҵ��(�Ű�����,...) {...}
//public <T> Box<T> boxing(T t){...}

//<T>: Ÿ�� �Ķ���͸� �Ű������� ���� Ÿ���� Ÿ������ ����ϰڴٴ� �ǹ�
//ȣ���� �� <T> ������ ���� Box<T>�� (T t)�� ����
public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}

}
