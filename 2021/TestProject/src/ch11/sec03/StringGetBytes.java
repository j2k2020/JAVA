package ch11.sec03;

public class StringGetBytes {
	public static void main(String[] args) {
		//�⺻ ���ڼ�
		System.out.println("file.encoding: "+System.getProperty("file.encoding"));
		
		//���� �ε���� CP949����� ����ߴµ� MS�翡�� EUC-KR��Ŀ��� Ȯ���� MS949�� ���
		
		
		String str = "�ȳ��ϼ���";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: "+bytes1.length);
		
		//���ڿ� ����?
		System.out.println("str.length: "+str.length());
		
		String str1String = new String(bytes1);
		System.out.println("bytes1->String: "+str1);
		
		
		
		//Ư�� ���ڼ����� ���ڵ� ����Ʈ �迭 ���
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: "+);
			//�⺻ ���ڼ��� EUC-KR�� ���ڵ��� ����Ʈ �迭 ���
			
		}
	}

}
