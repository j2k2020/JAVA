package ch06.sec05;

/*final�ʵ�: �������� ���� ���� �ִ� �ʵ�
 * ���� ������ �� ���� ����*/

public class Person {
	final String nation = "Korea"; //���������� �ʱ�ȣ(���)
	final String ssn; // ������ �� �ο�
	String name;
	
	//������
	public Person( String ssn, String name ) {
		this.ssn=ssn; //�Ķ��Ÿ String ssn�� ���� �޾ƿ�.
		this.name=name;
	}
	
	

}
