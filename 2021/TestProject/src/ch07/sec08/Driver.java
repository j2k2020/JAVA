package ch07.sec08;

public class Driver {
//�Ű����� ������
	// �Ű����� �پ�ȭ�ϱ� ����
	// �Ű������� �ڽ� Ÿ�� ��ü ���
	// �ڵ�Ÿ�� ��ȯ
	// bus ��ü�� vehicle Ÿ������
	// taxi ��ü�� vehicle Ÿ������
	public void drive(Vehicle veh) {
		veh.run();
		System.out.println(veh.toString());

		/*
		 * ������ �޸��ϴ�.(�ڽ� Ŭ�������� ������) 
		 * ch07.sec08.Bus@15db9742 
		 * �ýð� �޸��ϴ�.(�ýö�� �ڽ� Ŭ�������� ������)
		 * ch07.sec08.Taxi@6d06d69c
		 */
	}

}
