package ch06.sec05;

public class PersonEx {

	public static void main(String[] args) {
		Person p1=new Person("12345","������");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		//p1.nation = "USA"; //final �ʵ� ���� �Ұ�
		//p1.ssn="66666032222" //final�ʵ�� ���� �Ұ�
		p1.name = "�̸���";

	}

}
