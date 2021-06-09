package ch10.sec01;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		// 정수 2개 입력 받고
		// 나누기 연산: 0으로 나우면 오류
		// 예외 처리 문장: "0으로 나눌 수 없습니다"
		Scanner sc = new Scanner(System.in);
		int n1, n2;

		System.out.println("숫자1:");
		n1 = sc.nextInt();
		System.out.println("숫자2:");
		n2 = sc.nextInt();

		try {
			System.out.println("나누기 결과:" + n1 / n2);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없다!!!");
		}

		sc.close();

	}

}
