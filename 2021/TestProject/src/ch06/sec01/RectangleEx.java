package ch06.sec01;

import java.util.Scanner;

public class RectangleEx {
	public static void main(String[] args) {
		//�ν��Ͻ� ��ü rec ����
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		
		//input() �޼ҵ� ȣ��
		r1.input();
		r2.input();
		
		//area() �޼ҵ� ȣ��
		r1.area();
		r2.area();
		
		System.out.println("r1:"+r1);
		System.out.println("r2:"+r2);
	}

}
