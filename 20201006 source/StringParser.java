
public class StringParser {

	public static void main(String[] args) {
		String cmd="copy a.txt b.txt";
		//String cmd="copy";
		//String cmd="copy a.txt";
		String[] arr=cmd.split(" ");
		//System.out.println(arr.length);
		/*
		if(arr.length>2) {
			
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		}
		*/
		if(!arr[0].equals("copy")) { //!arr[0].equals("copy")
			System.out.println("명령어를 확인하세요.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);	
		}
		
		if(arr[1].equals("") || arr[2].equals("")) {
			System.out.println("복사할 파일 확인하세요.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
	}

}
