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
		return super.toString()+ "\n�ñ�: " + unitPrice + "\n�ٹ��ð�: " + hours + "\n�����Ҿ�: "+calculatePay();
	}
	
	public int calculatePay() {
		return hours * unitPrice;
	}
	

}
