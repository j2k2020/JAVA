package ch10.sec02;

public class Account {
	public long balance;
	
	public Account() {}

	public long getBalance() {
		return balance;
	}
	
	//����
	public void deposit(int money) {
		balance += money;
	}
	
	//���
	//���� �߻� �ڵ带 ������ �ִ� �޼ҵ�
	//�ڽ��� ȣ���� ������ ���ܸ� ó���ϵ��� throw Ű����� ���ܸ� ���ѱ�
	public void withdraw(int money) throws BalanceInsufficientEx{
		if(balance < money) { //�ܰ� �����ϸ� ���� �߻�
			throw new BalanceInsufficientEx("�ܰ�"+(money-balance)+"������."); //���� �޽����� �����ڿ��� ����
		}
	}

}
