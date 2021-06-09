package ch16.sec02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용5", "기입할내용은?1"));
		list.add(new Board("제목2", "내용4", "기입할내용은?3"));
		list.add(new Board("제목3", "내용3", "기입할내용은?2"));
		list.add(new Board("제목4", "내용2", "기입할내용은?5"));
		list.add(new Board("제목5", "내용1", "기입할내용은?4"));
		
		list.remove(4); //배열의 4번째 제거/0부터 시작이므로 5번째 행 제거
		list.remove(1); //배열의 1번째 제거/0부터 시작이므로 2번째 행 제거
		list.remove(0); //배열의 0번째 제거/0부터 시작이므로 1번째 행 제거
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.Subject+"\t"+board.content+"\t"+board.writer);
		}
		

	}

}
