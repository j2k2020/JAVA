package ch07.sec03;

public class People {
	//�ʵ� name, ssn
	String name;
	String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "�̸�=" + name + "\nssn=" + ssn;
	};
	
	
	//PeopleŬ���� ��� ���� StudentŬ���� ����
	//�ʵ� stdNo
	//������ �ʱ�ȭ: �Ű������� ���� �޾Ƽ�
	//�θ� �����ڿ��� �Ű����� ����
	//toString()��� ���
	
	//���� Ŭ����: StudentEx
	
	

}
