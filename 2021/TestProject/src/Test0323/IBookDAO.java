package Test0323;

import java.util.Vector;

public interface IBookDAO { //data acess object
	public void insertBook(BookDTO dto);
	public Vector<BookDTO> selectAllBookList();
	public void updateBook(BookDTO dto);
	public void deleteBook(BookDTO dto); //(String bookNo)¸¸ ¹Þ¾Æµµ µÊ

}
