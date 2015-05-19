package bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.dao.BaseDao;
import bookstore.domain.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired 
	BaseDao baseDao;
	
	@Override
	public void persist(Book book) {
	
		baseDao.persist(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return baseDao.getAllBooks(Book.class);
	}

}
