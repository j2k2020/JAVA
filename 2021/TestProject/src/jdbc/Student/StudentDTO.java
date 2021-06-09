package jdbc.Student;

public class StudentDTO {
	// StudentDTO�� �ǽ� 1�� ���̺� ������ ���εǴ� �ʵ�� �޼ҵ带 ����.

	int stdNo; // �й�
	String stdName; // ����
	String stdDet; // ����
	String stdAddr; // �ּ�
	String stdTel; // ��ȭ��ȣ

	public StudentDTO() {}// �⺻ ������ �ʿ�

	public StudentDTO(int stdNo, String stdName, String stdDet, String stdAddr, String stdTel) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdDet = stdDet;
		this.stdAddr = stdAddr;
		this.stdTel = stdTel;
	}

	
	public int getStdNo() {return stdNo;}
	public void setStdNo(int stdNo) {this.stdNo = stdNo;}

	public String getStdName() {return stdName;}
	public void setStdName(String stdName) {this.stdName = stdName;}

	public String getStdDet() {return stdDet;}
	public void setStdDet(String stdDet) {this.stdDet = stdDet;}

	public String getStdAddr() {return stdAddr;}
	public void setStdAddr(String stdAddr) {this.stdAddr = stdAddr;}

	public String getStdTel() {return stdTel;}
	public void setStdTel(String stdTel) {this.stdTel = stdTel;}

	
	
	@Override
	public String toString() {
		// �Ѳ����� ���ڿ��� �����ؼ� �����ϱ� ���� StringBuilder Ŭ���� �̿�
		// ���� ���ڿ��� ���ϴ� ��� (append)
		StringBuilder builder = new StringBuilder();
		builder.append(stdNo);
		builder.append("\t");
		builder.append(stdName);
		builder.append("\t");
		builder.append(stdDet);
		builder.append("\t");
		builder.append(stdAddr);
		builder.append("\t");
		builder.append(stdTel);

		return builder.toString();
	}
}
