package ch15.sec01;

//���׸��� ������� ���� ���
//���� Ÿ�� ��ȯ�� �߻��ϴ� ���� Ȯ��

public class BoxEx {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("ȫ�浿"); //String -> Object�� �ڵ� Ÿ�� ��ȯ : object�� ���� ��������̶�
		String name = (String) box.getObject(); // Object -> String���� ���� Ÿ�� ��ȯ
		
		box.setObject(new Apple()); // Apple -> Object �ڵ� Ÿ�� ��ȯ
		Apple apple = (Apple)box.getObject(); //Object -> Apple ���� Ÿ�� ��ȯ
		
		System.out.println(name);
		System.out.println(apple);
	}

	
}
