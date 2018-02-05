package com.bookapp.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bookapp.bean.Book;
import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookImpl;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookServiceImpl implements BookService {
  
	private final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	BookDAO bookDAO = new BookImpl();
	
	@Override
	public void addBook(Book book) {
		logger.info("in service: adding book");
		bookDAO.addBook(book);
	}

	@Override
	public boolean deleteBook(int bookid) throws BookNotFoundException {
        logger.info("in service: delete book by id {}",bookid);
		return bookDAO.deleteBook(bookid);
	}

	@Override
	public Book getBookById(int bookid) throws BookNotFoundException {
       
		logger.info("in service: get book by id {}",bookid);
		Book book = bookDAO.getBookById(bookid);
		if(book==null){
			logger.warn("in service: book is null");
			throw new BookNotFoundException("no book by id");
		}
		return null;
	}

	@Override
	public boolean updateBook(int bookid, int price) {
		  logger.info("in service: update book by id {}",bookid);
			return bookDAO.updateBook(bookid,price);
	}

	@Override
	public List<Book> getAllBooks() {
		  logger.info("in service: get all the books");
			return bookDAO.getAllBooks();
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		logger.info("in service: get book by author {}",author);
		return bookDAO.getBookbyAuthor(author);
	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {
		logger.info("in service: get book by category {}",category);
		return bookDAO.getBookbycategory(category);
	}

}
