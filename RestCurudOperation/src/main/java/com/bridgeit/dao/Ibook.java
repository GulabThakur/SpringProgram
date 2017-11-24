package com.bridgeit.dao;

import java.util.List;

import com.bridgeit.model.Book;

/**
 * @author GulabThakur
 * @this interface of DAO package
 */
public interface Ibook {
	public Book insert(Book book);

	public void delete(long id);

	public Book getBook9(long id);

	public List<Book> getBooks();

	public Book update(long id, Book book);
}
