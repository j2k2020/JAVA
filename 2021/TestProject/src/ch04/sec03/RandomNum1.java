package ch04.sec03;

//랜덤 숫자 생성
//(1) Math.random()사용
//(2) Random 클래스 사용
public class RandomNum1 {
	public static void main(String[] args) {
		//(1) Math.random()사용
		for(int i=1; i<10; i++) {
			//0부터 시작 10정수: 0~9숫자출력
			//int num = (int)(Math.random()*10);
			
			//1~10 사이의 정수 출력
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
		}
		
		//(2) Random 클래스 사용
		
		
	}

}
