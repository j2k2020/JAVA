package ch06.sec01;

import java.util.Scanner;

//������


public class ProductEx {
	public static void main(String[] args) {
		//�ν��Ͻ� ��ü rec ����
		Product prd = new Product();
		
		//input() �޼ҵ� ȣ��
		prd.inputPrdInfo(); //�Է��� �ʵ�� �ѱ�� �޼ҵ�
		
		//area() �޼ҵ� ȣ��
		prd.showPrdInfo(); //����� �����͸� ����ϴ� �޼ҵ�
		prd.salesAmount();
		prd.stockAmount();
		
	}

}
