package ch06.sec04;

//static �ʱ�ȭ ���
//Ŭ������ �޼ҵ� ����(static����)���� �ε��� �� ó������ �����ϴ� ���
//�������� ����Ǹ� ����� ������� ����

public class Television {
	static String company = "Samsung";
	static String model ="LED TV";
	static String info;
	
	static {
		info = company+"-"+model;
	}

}
