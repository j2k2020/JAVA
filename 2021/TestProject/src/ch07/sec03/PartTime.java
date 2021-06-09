package ch07.sec03;

public class PartTime extends Worker{
	private int unitPrice;
	private int hours;

	public PartTime(String joominNo, String name, int unitPrice, int hours) {
		super(joominNo, name);
		this.unitPrice = unitPrice;
		this.hours = hours;
		
	}
	@Override
	public String toString() {
		return super.toString()+ "\n시급: " + unitPrice + "\n근무시간: " + hours + "\n총지불액: "+calculatePay();
	}
	
	public int calculatePay() {
		return hours * unitPrice;
	}
	

}
