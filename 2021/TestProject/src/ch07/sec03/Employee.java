package ch07.sec03;

//�θ� Ŭ����  = ���� Ŭ����

public class Employee {
	private String empNo;
	private String empName;
	private String empPart;
	
	
	//�Ű������� 3�� �ִ� ������
	//�ڽ� Ŭ������ �����ڷκ��� �Ű������� ���� �޾Ƽ� �ʵ� �ʱ�ȭ
	public Employee(String empNo, String empName, String empPart) {
		this.empNo = empNo;
		this.empName = empName;
		this.empPart = empPart;
	}


	@Override
	public String toString() {
		return "���=" + empNo + "\n����=" + empName + "\n�μ�=" + empPart;
	}
	
	
	
	

}