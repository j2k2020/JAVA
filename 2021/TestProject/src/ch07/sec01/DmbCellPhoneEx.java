package ch07.sec01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellPhone dm = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���� ���� ��� ���� �ʵ�
		System.out.println("��:"+dm.model);
		System.out.println("����:"+dm.color);
		
		//DmbCellPhone �ʵ�
		System.out.println("ü��:"+dm.channel);
		
		//cellPhone���� ���� ��� ���� �޼ҵ� ȣ��
		dm.powerOn();
		dm.bell();
		dm.sendVoice("�ȳ��ϼ���");
		dm.receiveVoice("TV�� ���ֽ���");
		dm.sendVoice("���� �ܱ����Դϴ�.");
		dm.hangUp();

	}

}
