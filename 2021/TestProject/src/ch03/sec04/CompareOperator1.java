package ch03.sec04;

public class CompareOperator1 {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=10;
		
		boolean result1=(num1 == num2);
		boolean result2=(num1 != num2);
		boolean result3=(num1 <= num2);
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		
		char ch1= 'A';
		char ch2= 'B';
		boolean result4=(ch1 < ch2);
		System.out.println("result4: "+result4);
		
		System.out.println("A��: "+(int)ch1);//65
		System.out.println("B��: "+(int)ch2);//66
		
		char ch_1= 'a';
		char ch_2= 'b';
		boolean result5=(ch_1 < ch_2);
		System.out.println("result5: "+result5);
		
		System.out.println("a��: "+(int)ch_1);//97
		System.out.println("b��: "+(int)ch_2);//98
		
		//�빮��A: 65���� , �ҹ���a: 97����
		
	}

}
