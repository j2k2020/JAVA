
public class KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b =new byte[1024];
		int len=0;
		
		try {
		
			//byte c=(byte)System.in.read();
			//int c=System.in.read();
			/*
			len=System.in.read(b);
			System.out.println(len);
			System.out.println(b.toString());
			
			String  str=new String(b,0,len);
			System.out.println(str);
			System.out.write(b,0,len);
			*/
			while(true) {
			System.out.println("번호를 입력하세요.");
			int c=System.in.read();
			c=c-'0';
			//System.out.println(c);
			if(c==1) {System.out.println("모터 회전");}
			else if(c==2) {System.out.println("모터 회전 50회전");}
			else if(c==0) {System.out.println("모터 정지");}
			else if(c==3) {System.out.println("프로그램 종료"); break;}
			}
		}catch(Exception e) {
			
		}
	}

}
