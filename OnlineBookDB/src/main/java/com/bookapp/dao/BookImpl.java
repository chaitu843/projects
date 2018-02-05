package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookImpl implements BookDAO{

	@Override
	public void addBook(Book book) {
		/*Connection connection = ModelDAO.openConnection();
		PreparedStatement st = connection.prepareStatement(sql);
		st.execute();*/
	}

	@Override
	public boolean deleteBook(int bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book getBookById(int bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBook(int bookid, int price) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
