
class  MyRuns implements Runnable
{
	public void run(){
		show();
	}
	public void show(){
		for(int i=0;i<100;i++){
			if(((Thread.currentThread()).getName()).equals("a") ){
				System.out.print("a");
				//System.out.print("[A"+i+"]");
			}else if(((Thread.currentThread()).getName()).equals("b") ){
				//System.out.print("[B"+i+"]");
				System.out.print("b");
			}else if(((Thread.currentThread()).getName()).equals("c") ){
				//System.out.print("[C"+i+"]");
				System.out.print("c");
			}else{
				System.out.print("["+Thread.currentThread().getName()+i+"]");
			}
		}
	}
}


public class   MyRunsMain
{
	public static void main(String[] args) 
	{
		MyRuns mr1=new MyRuns();
		Thread t1=new Thread(mr1,"a");
		Thread t2=new Thread(mr1,"b");
		Thread t3=new Thread(mr1,"c");
		//Thread t3=new Thread(mr1);
		t1.start();
		t2.start();
		t3.start();
	}
}
