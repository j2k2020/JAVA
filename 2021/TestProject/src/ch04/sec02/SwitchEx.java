package ch04.sec02;

//switch��
//����!! -> �������δ� ����� ����, ���ڿ�, ���� ���̾�� ��
//case ���� value�δ� �ݵ�� �ϳ��� ���� ���(����1~10�� �� �� ����)
//case �������� �ݷ�(:),(;)�ƴ�
//

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.println("���� �Է�:");
		score= sc.nextInt();
		int num = score /10;
		
		switch(num) { //year�� ���� ��
		case 10:	
		case 9: 
				System.out.println("A"); break;
			case 8: 
				System.out.println("B"); break;
			case 7: 
				System.out.println("C"); break;
			case 6: 
				System.out.println("D"); break;
			default: 
				System.out.println("F");
		}
		sc.close();
	}

}
