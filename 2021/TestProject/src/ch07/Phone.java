package ch07;

public class Phone {
	public String owner;
	
	//»ý¼ºÀÚ
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("turnOn");
	}
	
	public void turnOff() {
		System.out.println("turnOff");
	}

}
