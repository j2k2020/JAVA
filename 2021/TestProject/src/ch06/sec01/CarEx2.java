package ch06.sec01;

public class CarEx2 {
	public static void main(String[] args) {
		//Car Ŭ������ ��ü ����
		Car2 c1 = new Car2();
		Car2 c2 = new Car2();
		Car2 c3 = new Car2();
		
		//�ν��Ͻ�(��ü): �ʵ��� �� ����
		//��ü.�ʵ�
		//c1.carNo="11�� 1234";
		//�޼ҵ带 ȣ��: �ʵ� ���� �߷���
		//��ü.�޼ҵ�()
		//c1.showCarInfo(11�� 1234);
		System.out.println("-----------c1.----------");
		c1.setCarNo("1234");
		c1.setMyCar("������", "����", 2018, 3000);
		c1.showCarInfo();
		
		System.out.println("-----------c2.----------");
		c2.setCarNo("1234");
		c2.setMyCar("������", "����", 0,0 );
		c2.setCarYear(2011);
		c2.setCarCC(3400);
		c2.showCarInfo();
		
		System.out.println("-----------c3.----------");
		c3.setCarNo("234");
		c3.setCarName("������");
		c3.setCarMaker("����");
		c3.setCarYear(2020);
		c3.setCarCC(3000);
		c3.showCarInfo();
		
		
	
		
		
		
		
		
	}

}
