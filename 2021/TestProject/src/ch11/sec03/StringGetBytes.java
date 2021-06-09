package ch11.sec03;

public class StringGetBytes {
	public static void main(String[] args) {
		//기본 문자셋
		System.out.println("file.encoding: "+System.getProperty("file.encoding"));
		
		//원래 인도우는 CP949방식을 사용했는데 MS사에서 EUC-KR방식에서 확장해 MS949로 사용
		
		
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: "+bytes1.length);
		
		//문자열 길이?
		System.out.println("str.length: "+str.length());
		
		String str1String = new String(bytes1);
		System.out.println("bytes1->String: "+str1);
		
		
		
		//특정 문자셋으로 인코딩 바이트 배열 얻기
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: "+);
			//기본 문자셋을 EUC-KR로 인코딩된 바이트 배열 얻기
			
		}
	}

}
