package ch06.sec03;

import java.util.Scanner;

public class Member {
	String ID;
	String name;
	int age;
	String phone;
	String address;
	
	//파라미터 vs 알규먼트
	//파라미터 메소드를 정의 할 때  
	public Member(String ID, String name, int age,String phone,String address) {
		this.ID = ID;
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
	}
	
	public void member1() {
		System.out.println("---------회원 정보 출력-----------");
		System.out.println("아이디: "+this.ID);
		System.out.println("성명: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("전화번호: "+this.phone);
		System.out.println("주소: "+this.address);
		System.out.println();
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.print("아이디 입력:");
		ID=sc.next();
		System.out.print("성명 입력:");
		name=sc.next();
		System.out.print("나이 입력:");
		age=sc.nextInt();
		System.out.print("전화번호 입력:");
		phone=sc.next();
		System.out.print("주소 입력:");
		address=sc.next();
		
		sc.close();
	}
	
	public void member2() {
		System.out.println("---------회원 정보 출력-----------");
		System.out.println("아이디: "+this.ID);
		System.out.println("성명: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("전화번호: "+this.phone);
		System.out.println("주소: "+this.address);
	}

}
