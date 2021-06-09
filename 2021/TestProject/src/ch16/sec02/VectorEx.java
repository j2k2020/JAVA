package ch16.sec02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1", "����5", "�����ҳ�����?1"));
		list.add(new Board("����2", "����4", "�����ҳ�����?3"));
		list.add(new Board("����3", "����3", "�����ҳ�����?2"));
		list.add(new Board("����4", "����2", "�����ҳ�����?5"));
		list.add(new Board("����5", "����1", "�����ҳ�����?4"));
		
		list.remove(4); //�迭�� 4��° ����/0���� �����̹Ƿ� 5��° �� ����
		list.remove(1); //�迭�� 1��° ����/0���� �����̹Ƿ� 2��° �� ����
		list.remove(0); //�迭�� 0��° ����/0���� �����̹Ƿ� 1��° �� ����
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.Subject+"\t"+board.content+"\t"+board.writer);
		}
		

	}

}
