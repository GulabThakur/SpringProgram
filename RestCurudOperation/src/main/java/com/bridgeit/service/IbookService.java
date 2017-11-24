package com.bridgeit.service;

import java.util.List;

import com.bridgeit.model.Book;

public interface IbookService {
	public Book save(Book book);

	public void delete(long id);

	public Book book(long id);

	public List<Book> listBook();

	Book update(long id, Book book);
}
