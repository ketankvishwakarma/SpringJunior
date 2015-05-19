package bookstore.dao;

import java.util.List;

public interface BaseDao {

	public void persist(Object obj);
	
	public <T> List<T> getAllBooks(Class<T> clazz);
}
