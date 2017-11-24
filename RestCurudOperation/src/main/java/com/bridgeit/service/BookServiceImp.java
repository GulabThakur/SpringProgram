package com.bridgeit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.dao.Ibook;
import com.bridgeit.model.Book;
@Service
@Transactional(readOnly=true)
public class BookServiceImp  implements IbookService{
	@Autowired
	private Ibook bookImp;
	@Transactional
	
	public Book save(Book book) {
		return bookImp.insert(book);
	}
	@Transactional
	
	public void delete(long id) {
		bookImp.delete(id);
	}
    @Transactional

	public Book update(long id,Book book) {
		
		return bookImp.update(id, book);
	}

	
	public Book book(long id) {
		
		return bookImp.getBook9(id);
	}

	
	public List<Book> listBook() {
		return bookImp.getBooks();
	}

}
