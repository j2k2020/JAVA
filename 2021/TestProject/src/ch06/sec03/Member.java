package ch06.sec03;

import java.util.Scanner;

public class Member {
	String ID;
	String name;
	int age;
	String phone;
	String address;
	
	//�Ķ���� vs �˱Ը�Ʈ
	//�Ķ���� �޼ҵ带 ���� �� ��  
	public Member(String ID, String name, int age,String phone,String address) {
		this.ID = ID;
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
	}
	
	public void member1() {
		System.out.println("---------ȸ�� ���� ���-----------");
		System.out.println("���̵�: "+this.ID);
		System.out.println("����: "+this.name);
		System.out.println("����: "+this.age);
		System.out.println("��ȭ��ȣ: "+this.phone);
		System.out.println("�ּ�: "+this.address);
		System.out.println();
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.print("���̵� �Է�:");
		ID=sc.next();
		System.out.print("���� �Է�:");
		name=sc.next();
		System.out.print("���� �Է�:");
		age=sc.nextInt();
		System.out.print("��ȭ��ȣ �Է�:");
		phone=sc.next();
		System.out.print("�ּ� �Է�:");
		address=sc.next();
		
		sc.close();
	}
	
	public void member2() {
		System.out.println("---------ȸ�� ���� ���-----------");
		System.out.println("���̵�: "+this.ID);
		System.out.println("����: "+this.name);
		System.out.println("����: "+this.age);
		System.out.println("��ȭ��ȣ: "+this.phone);
		System.out.println("�ּ�: "+this.address);
	}

}
