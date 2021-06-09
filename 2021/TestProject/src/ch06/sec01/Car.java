package ch06.sec01;

public class Car {
	
		//클래스의 멤버 필드 = 데이터
		private String carNo;
		private String carName;
		private String carMaker;
		private int carYear;
		private int carCC;
		
		public void setCarNo(String no) {
			carNo = no;
		}

		
		//클래스의 멤버 메소드 - 작업 처리 (기능)
		public void showCarInfo() {
		//public밖에서도 사용 가능 void반환 값 없음
			System.out.println("차량번호:"+ carNo);
		}
}
