package ch11.sec03;

public class IndexOfEx {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�")!= -1) {
			System.out.println("�ڹٿ� �����ֱ�");
		}else{System.out.println("�ڹٿ� ����X");}

	}

}
