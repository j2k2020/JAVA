package ch10.sec02;

//����ó�� ���ѱ��
//throws: �޼ҵ忡�� ó������ ���� ���ܸ� ȣ���� ������ �� �ѱ��

//catch ��Ͽ��� ���� ó���� �ؾ� ��
public class Throws {

	public static void main(String[] args) {
		
		try {
			findClass(); //throws�� ���� �޼ҵ带 ȣ��(�ݵ�� try��� �ȿ��� ȣ��)
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�."); //����ó��
		}
		

	}
	
	//find Class() �޼ҵ带 ȣ���� ������ ���� ó�� �� �ѱ�
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
