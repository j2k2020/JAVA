package ch11.sec02;

public class ByteToString {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,72};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes);
		System.out.println();
		
	}
	
	

}
