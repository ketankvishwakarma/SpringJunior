package bookstore.service;

import java.util.List;

import bookstore.domain.Book;

public interface BookService {

	public void persist(Book book);
	public List<Book> getAll();  
}
