package ch07.sec03;

public class Student extends People {
	
	String stdNo;

	public Student(String name, String ssn, String stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}

	@Override
	public String toString() {
		//super.toString()으로 -부모 클래스의 toString()호출
		return super.toString() + "\n학생 번호=" + stdNo;
	}
	
	

}
