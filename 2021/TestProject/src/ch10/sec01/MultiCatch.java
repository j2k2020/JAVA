package ch10.sec01;

public class MultiCatch {

	public static void main(String[] args) {
		
		
		String data11="100";
		String data21="1000";
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			
			System.out.println("args 0: "+data1);
			System.out.println("args 1: "+data2);
			
			
			
			int value1 = Integer.parseInt(data11); //Integer.parseInt�� ���� Ÿ���� ���ڿ��� ���ڷ� ��ȯ���ִ� ����
			int value2 = Integer.parseInt(data21);
			
			int result = value1 + value2;
			System.out.println("���: "+result);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ������ ��� ���ܴ� ���⼭ ó���ϰڴ�");
		}catch (NumberFormatException e) {
			System.out.println("���� ������ �� ���Ǽ� �߻��� ���ܴ� ���⼭ ó���ϰڴ�");
		}
	}

}
