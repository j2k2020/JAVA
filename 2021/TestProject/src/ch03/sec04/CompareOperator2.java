package ch03.sec04;

import java.util.Scanner;

//�� ������
//���ڿ� ��: equals() �޼ҵ� ���

public class CompareOperator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pass ="1234";
		String userPass;
		
		System.out.println("��й�ȣ �Է�:");
		 userPass = sc.next();
		 
		 //���ڿ� �� 
		 // == ������� x, euqals() �޼ҵ� ���
		 if(pass.equals(userPass))
			 System.out.println("PAS");
		 else {
			System.out.println("NO PASS");
		}
		 
		 sc.close();
	
		
	}

}
