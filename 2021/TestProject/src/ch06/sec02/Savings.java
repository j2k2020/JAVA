package ch06.sec02;

import java.util.Scanner;

public class Savings {
	String name;
	int deposit;
	int interest;
	int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void inputDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("예금액 입력:");
		deposit=sc.nextInt();
	}
	
	public int getInterest() {
		return balance+deposit;
	}
	
	
	
}
