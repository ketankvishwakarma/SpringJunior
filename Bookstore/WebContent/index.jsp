<%@page import="java.util.List"%>
<%@page import="bookstore.domain.Book"%>
<%@page import="bookstore.dao.BaseDao"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>welcome to bookstore!!</h4>
<hr>
<%
	WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
	BaseDao baseDao=context.getBean("baseDao",BaseDao.class);
	Book book1=new Book();
	book1.setBookname("The Tale Of Two Cities");
	book1.setPrice(100.10d);
	baseDao.persist(book1);

	List<Book> allBooks=baseDao.getAllBooks(Book.class);
	out.println("Book Count: "+allBooks.size()+"<BR><BR><BR>");
	for(Book b1:baseDao.getAllBooks(Book.class))
	{
		out.println(b1.getBookId()+" : "+b1.getBookname()+"<BR>");
	}
%>
</body>
</html>