package bookstore.controller;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bookstore.domain.Book;
import bookstore.service.BookService;

@Controller

public class BookController {

	protected final Log logger=LogFactory.getLog(getClass());
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/addBook",method=RequestMethod.GET)
	public ModelAndView addBooks(){
		
		return new ModelAndView("addBooks","book",new Book());
	}
	
	
	@RequestMapping(value="/saveBook",method=RequestMethod.POST)
	public ModelAndView saveBook(Book book){
		
		bookService.persist(book);
		
		return new ModelAndView("listBooks","books",book);
	}
	
	
	@RequestMapping(value="/abc", method=RequestMethod.GET)
	public ModelAndView test(){
		return new ModelAndView("addBooks","msg",new Date());
	}
	
}
