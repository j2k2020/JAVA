package ch11.sec03;

public class SubstringEx {
	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
	    
		//substring(start, end): start���� end-1���� ����
		String firstNum = ssn.substring(0, 6); //�ε��� 5���� ���� (6��°���� ����) �迭�� 0���� ī���� �Ǵϱ�
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //�ε��� 7���� ������
		System.out.println(secondNum);
		
		//����� 
		String therdNum = ssn.substring(0,2);
		String fourNum = ssn.substring(3,4);
		String fivNum = ssn.substring(4,6);
		System.out.println("����� "+therdNum+"�� "+fourNum+"�� "+fivNum+"�Ͽ� �¾�̱���");
	}

}
