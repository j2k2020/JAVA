class Calculator{
	private int memory;
	public int getMomory() {
			return memory;
		}
	
	//public void setMomory(int memory) {
	public synchronized void setMomory(int memory) {
		this.memory=memory;
		try { System.out.println
			(Thread.currentThread().getName() +":"+this.memory); }
		catch(Exception e) { }
	}
}

class User1 extends Thread{
	Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("USER1");
		this.cal=cal;
	}
	
	public void run() {
		cal.setMomory(100);
	}
}

class User2 extends Thread{
	Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("USER2");
		this.cal=cal;
	}
	public void run() {
		cal.setMomory(50);
	}
}

public class MainThread {

	public static void main(String[] args) {
	Calculator cal=new Calculator();
	
	User1 user1=new User1();
	user1.setCalculator(cal);
	user1.start();
	
	User2 user2=new User2();
	user2.setCalculator(cal);
	user2.start();

	}

}
