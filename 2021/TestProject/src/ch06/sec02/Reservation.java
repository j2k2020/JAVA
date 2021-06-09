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
		name = name; // 둘 다 매개변수로 인식한다. 그래서 출력하면 null값 뜸
		deparcher = dep;
		desitnation = des;
		price = p;
		seat = s;
	}
	
	public void show() {
		System.out.println("*******항공권 예약 정보*******");
		System.out.println("항공기:"+flright);
		System.out.println("예약자:"+name);
		System.out.println("출발지:"+deparcher);
		System.out.println("도착지:"+desitnation);
		System.out.println("금액:"+price);
		System.out.println("좌석:"+seat);
		System.out.println();
	}

}
