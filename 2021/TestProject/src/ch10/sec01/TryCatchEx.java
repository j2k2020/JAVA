package ch10.sec01;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}
		catch(ClassNotFoundException e){
		        System.out.println("Ŭ������ �������� ����!");	
		}
		
		
		
		String data1="100";
		String data2="��1000";
		try {
		//���ڿ��� ������ ��ȯ
		int value1 = Integer.parseInt(data1); //Integer.parseInt�� ���� Ÿ���� ���ڿ��� ���ڷ� ��ȯ���ִ� ����
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println("���: "+result);
		
		}
		catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}finally {
			System.out.println("�����մϴ�.");
		}
		
		

	}

}
