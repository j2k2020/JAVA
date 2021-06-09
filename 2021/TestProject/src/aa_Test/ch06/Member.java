package aa_Test.ch06;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member(String n, String i) {
		name=n;
		id=i;
	}

	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		

	}

}
