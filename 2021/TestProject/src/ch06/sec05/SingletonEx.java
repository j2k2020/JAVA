package ch06.sec05;

public class SingletonEx {

	public static void main(String[] args) {
		//�����ڸ� private���� ���� ���ұ� ������ not visible ������ ����.
		//Singleton obj1 = new Singleton(); �̷��Դ� ��� �Ұ�
		
		
		//�ܺο� ������
		//static �޼ҵ��� getInstance()�� ȣ���ؼ� ��ü�� ��ȯ ����
		Singleton obj1 = Singleton.getInSingleton();
		Singleton obj2 = Singleton.getInSingleton();
		
		
		if(obj1 == obj2) {
			System.out.println("����  Singleton ��ü�̴�");
			//static���� ��������� ���� ��ü�̴�. static�� Ŭ������ �ϳ��� ��������� �����̴�.
		}else {
			System.out.println("�ٸ�  Singleton ��ü�̴�");
		}
		
	

	}

}
