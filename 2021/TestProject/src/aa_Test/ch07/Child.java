package aa_Test.ch07;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		this.name = name;
		this.studentNo = studentNo;
	}
	//상위 클래스에 기본 생성자가 없음. 슈퍼 클래스를 받아 사용해야 됨

}
