package ch07.sec01;

//ChildŬ������ ParentŬ�����κ��� ��� ����
//Ű���� extends���
public class Child extends Parent{
	//Child Ŭ������ �ʵ�
	private int c;
	
	public void setChild() {
		c =20;
	}
	
	public void showChild(){
		//ChildŬ������ ParentŬ�����κ��� ����� �޾ұ� ������ 
		//ParentŬ������ �޼ҵ� ��� ����
		showParent(); //�θ� Ŭ������ �޼ҵ�
		System.out.println("�ڽ� Ŭ����c:"+c); //�ڽ� �ڽ��� �޼ҵ�
	}

}
