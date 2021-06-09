package ch04.sec03;

public class For {
	public static void main(String[] args) {
		
		//for문에서 선언된 변수 (int i)는 for문에서만 사용 가능
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		int i;
		
		// 1~100까지
		//1부터 100까지 1씩 증가하면서 sum에 더해져서 저장됨
		//조건에서 i가 100되면 true이므로 문장 수행
		//그리고 1증가: 101이 되면 조건에 맞지 않으므로 반복문 중단
		//반복문을 수행하고 난 후의 i값은 101
		for(i=1; i<=10; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println("1~"+(i+1)+"합: "+sum);
	}

}
