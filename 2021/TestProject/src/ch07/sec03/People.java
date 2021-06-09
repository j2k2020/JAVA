package ch07.sec03;

public class People {
	//필드 name, ssn
	String name;
	String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "이름=" + name + "\nssn=" + ssn;
	};
	
	
	//People클래스 상속 받은 Student클래스 생성
	//필듸 stdNo
	//생성자 초기화: 매개변수로 전달 받아서
	//부모 생성자에게 매개변수 전달
	//toString()사용 출력
	
	//실행 클래스: StudentEx
	
	

}
