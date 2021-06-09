package ch06.sec01;

public class Car2 {

	// 클래스의 멤버 필드 = 데이터
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

	// 클래스의 멤버 메소드 - 작업 처리 (기능)
	public void showCarInfo() {
		// public밖에서도 사용 가능 void반환 값 없음
		System.out.println("차량 번호: " + carNo);
		System.out.println("차량명: " + carName);
		System.out.println("차량 브렌드: " + carMaker);
		System.out.println("차량 연식: " + carYear);
		System.out.println("차량 배기량: " + carCC+"cc");
	}
}
