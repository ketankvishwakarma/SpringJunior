package bookstore.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bookstore.dao.BaseDao;


/*  
 * The @Repository annotation tells spring that the annotated class
 * is a component bean, so when spring scans packages
 * it registers the class as a bean & creates the same.
 * */
@Repository (value="baseDao")
@Transactional
public class BaseDaoImpl implements BaseDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void persist(Object obj) 
	{
		em.persist(obj);
	}

	@Override
	public <T> List<T> getAllBooks(Class<T> clazz) 
	{	
		TypedQuery<T> query=em.createQuery("from "+clazz.getName(), clazz);
		
		return query.getResultList();
	}

}
