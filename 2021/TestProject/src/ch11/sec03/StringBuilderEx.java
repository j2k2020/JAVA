package ch11.sec03;

public class StringBuilderEx {

	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	
	//append(): 끝에 추가
	sb.append("java ");
	sb.append("Program Study ");
	System.out.println(sb.toString());
	
	//insert(위치,문자열): 특정위치에 문자열 삽입
	sb.insert(4, "2"); 
	//sb.insert(4, "22");  //문자열이라 문자 갯수 제약이 없음
	System.out.println(sb.toString());
	
	//sb.setCharAt(index, ch); 위치,문자1개: 특정위치에 문자 설정(변경)
	sb.setCharAt(4, '6');
	//sb.setCharAt(4, '66'); //문자만 받아서 문자는 1개만 
	System.out.println(sb.toString());
	
	//sb.replace(start, end, str) replace(시작,끝,새문자열): 시작부터 끝-1까지의 문자열을 새 문자열로 대체(대치)
	sb.replace(6, 13, "Book");
	System.out.println(sb.toString());
	
	//sb.delete(start, end) :start에서 start-1까지 문자열 삭제
	sb.delete(4, 5); //4에서 4까지 - 4위치 1개문자
	System.out.println(sb.toString());
	
	int length = sb.length();
	System.out.println("총 문자수: "+length);
	
	String result = sb.toString();
	System.out.println(result);
	
	

	}

}








