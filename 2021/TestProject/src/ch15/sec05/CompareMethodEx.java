package ch15.sec05;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"���");
		
		//�� ���� ���ؼ� ���׸� �żҵ� compare() ȣ��
		boolean result1 = Util.<Integer, String>compare(p1,p2);
		if(result1) {
			System.out.println("p1�� p2�� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ��ü�Դϴ�.");
		}
		
		//p3: user1, ȫ�浿  //p4: user2, ȫ�浿
		//���ؼ� ��� ���
		Pair<String, String> p3 = new Pair<String, String>("user1","ȫ�浿");
		Pair<String, String> p4 = new Pair<String, String>("user2","ȫ�浿");
		boolean result2 = Util.<String, String>compare(p3,p4);
		if(result2) {
			System.out.println("p3�� p4�� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("p3�� p4�� �ٸ� ��ü�Դϴ�.");
		}

	}
}
