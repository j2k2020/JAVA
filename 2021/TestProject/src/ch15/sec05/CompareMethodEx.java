package ch15.sec05;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"사과");
		
		//두 값을 비교해서 제네릭 매소드 compare() 호출
		boolean result1 = Util.<Integer, String>compare(p1,p2);
		if(result1) {
			System.out.println("p1과 p2는 같은 객체입니다.");
		}else {
			System.out.println("p1과 p2는 다른 객체입니다.");
		}
		
		//p3: user1, 홍길동  //p4: user2, 홍길동
		//비교해서 결과 출력
		Pair<String, String> p3 = new Pair<String, String>("user1","홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2","홍길동");
		boolean result2 = Util.<String, String>compare(p3,p4);
		if(result2) {
			System.out.println("p3과 p4는 같은 객체입니다.");
		}else {
			System.out.println("p3과 p4는 다른 객체입니다.");
		}

	}
}
