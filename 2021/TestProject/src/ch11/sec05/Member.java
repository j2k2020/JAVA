package ch11.sec05;

//�迭 �׸� ����: Arrays.sort()
//Arrays.sort()�� �ڵ� 
public class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		this.name=name;
	}
	
	//�������̽� �߻�޼ҵ� ������
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		//compareTo()���ϰ�
		//���������� ��� �ڽ��� �Ű������� ���� ��� ����, ���� ��� 0,
		//���� ��� ��� ��ȯ
		//name �ʵ� ������ ����: �����ڵ� ��
		
	}

}
