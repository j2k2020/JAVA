package ch10.sec02;

//예외처리 떠넘기기
//throws: 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠 넘기는

//catch 블록에서 예외 처리를 해야 함
public class Throws {

	public static void main(String[] args) {
		
		try {
			findClass(); //throws가 붙은 메소드를 호출(반드시 try블록 안에서 호출)
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다."); //예외처리
		}
		

	}
	
	//find Class() 메소드를 호출한 곳으로 예외 처리 떠 넘김
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
