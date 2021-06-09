package ch11.sec03;

public class StringBuilderEx {

	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	
	//append(): ���� �߰�
	sb.append("java ");
	sb.append("Program Study ");
	System.out.println(sb.toString());
	
	//insert(��ġ,���ڿ�): Ư����ġ�� ���ڿ� ����
	sb.insert(4, "2"); 
	//sb.insert(4, "22");  //���ڿ��̶� ���� ���� ������ ����
	System.out.println(sb.toString());
	
	//sb.setCharAt(index, ch); ��ġ,����1��: Ư����ġ�� ���� ����(����)
	sb.setCharAt(4, '6');
	//sb.setCharAt(4, '66'); //���ڸ� �޾Ƽ� ���ڴ� 1���� 
	System.out.println(sb.toString());
	
	//sb.replace(start, end, str) replace(����,��,�����ڿ�): ���ۺ��� ��-1������ ���ڿ��� �� ���ڿ��� ��ü(��ġ)
	sb.replace(6, 13, "Book");
	System.out.println(sb.toString());
	
	//sb.delete(start, end) :start���� start-1���� ���ڿ� ����
	sb.delete(4, 5); //4���� 4���� - 4��ġ 1������
	System.out.println(sb.toString());
	
	int length = sb.length();
	System.out.println("�� ���ڼ�: "+length);
	
	String result = sb.toString();
	System.out.println(result);
	
	

	}

}








