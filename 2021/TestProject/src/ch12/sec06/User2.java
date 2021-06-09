package ch12.sec06;

public class User2 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("user2");
		this.calculator = calculator;
	}
	
	
	public void run() {
		calculator.setMemorey(50);
	}
	

}
