package ch07.sec03;

public class Student extends People {
	
	String stdNo;

	public Student(String name, String ssn, String stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}

	@Override
	public String toString() {
		//super.toString()���� -�θ� Ŭ������ toString()ȣ��
		return super.toString() + "\n�л� ��ȣ=" + stdNo;
	}
	
	

}
