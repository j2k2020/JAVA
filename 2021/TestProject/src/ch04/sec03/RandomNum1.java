package ch04.sec03;

//���� ���� ����
//(1) Math.random()���
//(2) Random Ŭ���� ���
public class RandomNum1 {
	public static void main(String[] args) {
		//(1) Math.random()���
		for(int i=1; i<10; i++) {
			//0���� ���� 10����: 0~9�������
			//int num = (int)(Math.random()*10);
			
			//1~10 ������ ���� ���
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
		}
		
		//(2) Random Ŭ���� ���
		
		
	}

}
