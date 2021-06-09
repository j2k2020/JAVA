package ch12.sec07;

public class User1 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("user1");
		this.calculator = calculator;
	}
	
	
	public void run() {
		calculator.setMemorey(100);
	}
	

}
