package ch15.sec04;

public class BoxingMethodEx {

	public static void main(String[] args) {
		// ���1: ȣ���� �� ��ü�� Ÿ�� ���
		Box<Integer> box = Util.<Integer>boxing(100);
		int intValue = box.getT();
		System.out.println(intValue);
		
		
		// ���2: ȣ�� �� ��ü�� Ÿ�� ����
		// �Ű����� ���� ��ü�� Ÿ���� ����
		Box<String> box2 = Util.boxing("ȫ�浿"); // <String>����
		String strValue = box2.getT();
		System.out.println(strValue);

	}

}
