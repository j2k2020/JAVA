package ch11.sec03;

public class SubstringEx {
	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
	    
		//substring(start, end): start에서 end-1까지 추출
		String firstNum = ssn.substring(0, 6); //인덱스 5까지 추출 (6번째까지 추출) 배열은 0부터 카운터 되니까
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //인덱스 7부터 끝까지
		System.out.println(secondNum);
		
		//당신은 
		String therdNum = ssn.substring(0,2);
		String fourNum = ssn.substring(3,4);
		String fivNum = ssn.substring(4,6);
		System.out.println("당신은 "+therdNum+"년 "+fourNum+"월 "+fivNum+"일에 태어나셨군요");
	}

}
