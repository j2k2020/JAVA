package ch02.sec02;
//������ Ÿ��
public class DataType {
	public static void main(String[] args) {
		//���� Ÿ�� ���� ���� �� �ʱ�ȭ	
		char a = 'A';
		char b = '\u0041';
		char c = 65;
		
		System.out.println("a:"+a +", b:"+b+", c:"+c);
		System.out.println("---------------------------------------");
		
		//����Ÿ�� ���� ���� �� �ʱ�ȭ
		int byteValue = 10; // 1byte
		int shortValue = 1000; //2
		int inValue = 2100200200; //4 
		long longValue = 100010001000100L; //8
		
		System.out.println("byteValue:"+byteValue);
		System.out.println("shortValue:"+shortValue);
		System.out.println("inValue:"+inValue);
		System.out.println("longValue:"+longValue);
		System.out.println("---------------------------------------");
		
		//�Ǽ� Ÿ�� ���� ���� �� �ʱ�ȭ
		double doubleValue = 1.234567890123456789; //8����Ʈ �Ǽ� (�� ������)
		float floatValue = 0.1234567890123456789f; //4����Ʈ �Ǽ�: f�� �� ���̸� ����
		
		System.out.println("doubleValue:"+doubleValue);
		System.out.println("floatValue:"+floatValue);
		System.out.println("---------------------------------------");
		
		//���� ǥ��: e ����ϱ�
		int var1 = 3000000;
		double var2 = 3e6;
		float var3 = 3e6f;
	    double var4 = 2e-3;
	    
	    System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("---------------------------------------");
		
		//�� Ÿ��
		boolean booleanValue = true;
		System.out.println("booleanValue: "+ booleanValue);
		System.out.println("---------------------------------------");
		
		//���ڿ� Stringtype
		String name = "ȫ�浿";
		System.out.println("�̸�: "+name);
	}

}








