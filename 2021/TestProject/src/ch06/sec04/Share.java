package ch06.sec04;

//static �ʵ� ����
//static�ʵ�� ��� ��ü�� ����

public class Share {
	int a; //�ν��Ͻ� �ʵ�
	static int staticA; //statci �ʵ�
	
	//�ν��Ͻ� �żҵ�
	public void set(int n) {
		a += n;
		staticA += n;
	}
	
	//�ν��Ͻ� �޼ҵ�
	public int showA(){
		return a;
		
	}
	
	//satic �޼ҵ�
	public static int showStaticA() {
		return staticA;
	}
	

}
