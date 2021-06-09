package jdbc.Student;

public class StudentDTO {
	// StudentDTO는 실습 1번 테이블 구조와 매핑되는 필드와 메소드를 가짐.

	int stdNo; // 학번
	String stdName; // 성명
	String stdDet; // 전공
	String stdAddr; // 주소
	String stdTel; // 전화번호

	public StudentDTO() {}// 기본 생성자 필요

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
		// 한꺼번에 문자열을 저장해서 전달하기 위해 StringBuilder 클래스 이용
		// 기존 문자열에 더하는 방식 (append)
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
