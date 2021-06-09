package ch06.sec05;

public class PersonEx {

	public static void main(String[] args) {
		Person p1=new Person("12345","정재은");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		//p1.nation = "USA"; //final 필드 수정 불가
		//p1.ssn="66666032222" //final필드로 수정 불가
		p1.name = "이몽룡";

	}

}
