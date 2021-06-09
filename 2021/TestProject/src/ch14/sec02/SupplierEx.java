package ch14.sec02;

import java.util.function.IntSupplier;

//supplier �Լ��� �������̽�
//�Ű����� ���� ���ϰ��� �ִ� �߻� �żҵ� ����

public class SupplierEx {
	public static void main(String[] args) {
		//int�� ���� ���ٽ�
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random() *6) + 1;
			return num;
		};
		
		//�߻� �żҵ� ȣ���ؼ� ����� ����
		int num = intSupplier.getAsInt();
		System.out.println(num);
		

	}

}
