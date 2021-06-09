package ch16.sec03;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		
		phone.put("�ʵ�ģ��", 
				new String[] {"010-1111-1111","02-2222-2222","chodong@naver.com"});
		phone.put("���ģ��", 
				new String[] {"010-1234-1234","02-3333-3333","abcd@naver.com"});
		phone.put("ȸ�絿��", 
				new String[] {"010-1234-1234","02-4444-4444","abcd@naver.com"});
		phone.put("ȸ����", 
				new String[] {"010-1234-1234","02-5555-5555","abcd@naver.com"});
		phone.put("�����", 
				new String[] {"abcd@naver.com"});


		System.out.println("�� �׷� �� = "+ phone.size());
		
		//�� ����ó ��� ���� ��ȸ
		Set<String> keys = phone.keySet();
		for(String key : keys) {
			System.out.println(key + " : ");
			String[] phonelist = phone.get(key);
			for (String one : phonelist) {
				System.out.print(one + " | ");
			}
			System.out.println();
		}
		
		//ȸ�絿�� �˻��ؼ� ���
		System.out.println("ȸ�絿�� �˻�:");
		if(phone.containsKey("ȸ�絿��")) {
			String[] phonelist = phone.get("ȸ�絿��");
			for(String one : phonelist) {
				System.out.println(one + " | ");
			}
		}
		
		System.out.println();
		
		//����� �˻�
		System.out.println("����� �˻�:");
		if(phone.containsKey("�����")) {
			String[] phonelist = phone.get("010");
			for(String one : phonelist) {
				System.out.println(one + " | ");
			}
		}else {
			System.out.println("����ó ����");
		}
	}

}
