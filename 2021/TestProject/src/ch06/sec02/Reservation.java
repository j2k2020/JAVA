package ch06.sec02;

public class Reservation {
	String flright;
	String name;
	String deparcher;
	String desitnation;
	int price;
	String seat;
	
	public Reservation() {
		
	}
	
	public Reservation(	String f, String name, String dep, String des, int p, String s) {
		flright = f;
		name = name; // �� �� �Ű������� �ν��Ѵ�. �׷��� ����ϸ� null�� ��
		deparcher = dep;
		desitnation = des;
		price = p;
		seat = s;
	}
	
	public void show() {
		System.out.println("*******�װ��� ���� ����*******");
		System.out.println("�װ���:"+flright);
		System.out.println("������:"+name);
		System.out.println("�����:"+deparcher);
		System.out.println("������:"+desitnation);
		System.out.println("�ݾ�:"+price);
		System.out.println("�¼�:"+seat);
		System.out.println();
	}

}
