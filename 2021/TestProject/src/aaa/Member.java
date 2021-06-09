package aaa;

public class Member {
	
	String memId;
	int memNo;
	String memName;
	int memAge;
	String memPhone;
	String memAddress;
	

	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public int getMemNo() {
		return memNo;
	}


	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}


	public String getMemName() {
		return memName;
	}


	public void setMemName(String memName) {
		this.memName = memName;
	}


	public int getMemAge() {
		return memAge;
	}


	public void setMemAge(int memAge) {
		this.memAge = memAge;
	}


	public String getMemPhone() {
		return memPhone;
	}


	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}


	public String getMemAddress() {
		return memAddress;
	}


	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}
	
	public void setMember(String memId,
	int memNo,
	String memName,
	int memAge,
	String memPhone,
	String memAddress) {
		this.memId=memId;
		this.memNo=memNo;
		this.memName=memName;
		this.memAge=memAge;
		this.memPhone=memPhone;
		this.memAddress=memAddress;
	}
	
	public void showMemberInfo() {
		System.out.println(memId+" | "+memNo+" | "+memName+" | "+memAge+" | "+memPhone+" | "+memAddress);
	}


	public static void main(String[] args) {
		
		Member mem1=new Member();
		Member mem2=new Member();
		Member mem3=new Member();
		
		mem1.setMember("abcd", 1234, "ȫ�浿", 30, "010-1234-1234", "����");
		mem1.showMemberInfo();
		mem2.setMember("flower", 5678, "�̸���", 30, "010-1111-1111", "���");
		mem2.showMemberInfo();
		mem3.setMember("sky", 1111, "������", 30, "010-2222-2222", "����");
		mem3.showMemberInfo();
		

	}

}
