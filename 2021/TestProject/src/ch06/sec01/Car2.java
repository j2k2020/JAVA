package ch06.sec01;

public class Car2 {

	// Ŭ������ ��� �ʵ� = ������
	private String carNo;
	private String carName;
	private String carMaker;
	private int carYear;
	private int carCC;

	public void setCarNo(String no) {
		carNo = no;
	}

	public void setCarName(String name) {
		carName = name;
	}

	public void setCarMaker(String maker) {
		carMaker = maker;
	}

	public void setCarYear(int year) {
		carYear = year;
	}

	public void setCarCC(int cc) {
		carCC = cc;
	}

	public void setMyCar(String name, String maker, int year, int cc) {
		carName = name;
		carMaker = maker;
		carYear = year;
		carCC = cc;

	}

	// Ŭ������ ��� �޼ҵ� - �۾� ó�� (���)
	public void showCarInfo() {
		// public�ۿ����� ��� ���� void��ȯ �� ����
		System.out.println("���� ��ȣ: " + carNo);
		System.out.println("������: " + carName);
		System.out.println("���� �귻��: " + carMaker);
		System.out.println("���� ����: " + carYear);
		System.out.println("���� ��ⷮ: " + carCC+"cc");
	}
}
