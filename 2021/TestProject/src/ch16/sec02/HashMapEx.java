package ch16.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		//map.put(key, value)
		map.put("ȫ�浿", 100);
		map.put("�̒D��", 85);
		map.put("ȫ�浿", 300);
		
		//Ű�� ������ �������� ������ ������ ��ü(�����)
		map.put("ȫ�浿", 87);
		map.put("����", 90);
		
		System.out.println("�� Entry��: "+map.size());
		System.out.println("�� hashCode: "+map.hashCode());
		System.out.println();
		
		
		//��ü ã��: Ű(�̸�)�� ��(����)�� �˻�
		System.out.println("ȫ�浿: "+ map.get("ȫ�浿"));
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); //Key set��ȯ
		//�ݺ��ؼ� Ű�� ��� ���� ������
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //key�� �˾Ƴ���
			Integer value = map.get(key); //key�� value ������
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿"); //remove(key)
		System.out.println("remove��, �� Entry��: "+map.size());
		
		//��ü ��ü ����
		map.clear();
		System.out.println("clear��, ��Entry��: "+map.size());
		

	}

}
