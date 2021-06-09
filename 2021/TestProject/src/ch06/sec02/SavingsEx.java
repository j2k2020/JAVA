package ch06.sec02;

public class SavingsEx {
	  public static void main(String[] args) {
		  Savings save = new Savings();
			
			save.setName("홍길동");
			System.out.println("예금주: "+save.name);
			save.setBalance(10000);
			System.out.println("입금전 잔액: "+save.balance);
			save.inputDeposit();
			System.out.println("예금액 입력:");
			
			

	  }
	
	
	

}
