package aa_Test.ch06;

public class MemberService {
	String id;
	String password;
	
	public void setlogin(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void setlogout(String id) {
		this.id = id;
		
	}


	boolean login(String id, String password) {
		if((id=="hong") && (password=="12345")) {
			return true;
		}return false;
	}
	
	public void logout(String id) {
		if(id=="hong") {
		System.out.println("로그아웃 되었습니다");
		}
	}
	


}
