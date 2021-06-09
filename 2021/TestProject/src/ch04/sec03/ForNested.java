package ch04.sec03;

public class ForNested {
	public static void main(String[] args) {
		
		
		//아래로 정렬
		/*for(int m=2; m<=9; m++) {
			System.out.println("____"+m+"단____");
			
			for( int n=1; n<=9; n++) {
				System.out.println(m+" x "+n+" = "+(m*n));
			}
			System.out.println();
		}
		*/

		
		
		//ForNestedEx -- 옆으로 정렬
		
		for(int m=1; m<=9; m++) {	
			for( int n=2; n<=9; n++) {
				System.out.print(n+" x "+m+" = "+m*n + '\t');
			}
			System.out.println();
		}
	
	}

}
