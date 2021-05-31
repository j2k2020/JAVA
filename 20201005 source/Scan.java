import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int math;
		
		System.out.println("이름을 입력하세요?");
		name=sc.next();
		
		System.out.println("수학점수를 입력하세요?");
		math=sc.nextInt();
		
		System.out.print(name + ":" + math);
		
	}

}
