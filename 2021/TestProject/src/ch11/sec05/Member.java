package ch11.sec05;

//배열 항목 정렬: Arrays.sort()
//Arrays.sort()는 자동 
public class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		this.name=name;
	}
	
	//인터페이스 추상메소드 재정의
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		//compareTo()리턴값
		//오름차순인 경우 자신이 매개값보다 낮을 경우 음수, 같을 경우 0,
		//높을 경우 양수 반환
		//name 필드 값으로 정렬: 유니코드 비교
		
	}

}
