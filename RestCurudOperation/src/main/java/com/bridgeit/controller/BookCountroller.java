package com.bridgeit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.model.Book;
import com.bridgeit.service.IbookService;

@RestController
public class BookCountroller {

	@Autowired
	private IbookService bookServiceImp;

	@RequestMapping("/book1")
	public ResponseEntity<String> welcome() {
		String welcome = "Welcome to RestTemplate Example.";
		return new ResponseEntity<String>(welcome, HttpStatus.OK);
	}

	@RequestMapping(value = "/book", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List> getEmployees() {
		List<Book> list = bookServiceImp.listBook();
		return new ResponseEntity<List>(list,HttpStatus.OK);
	}

	@RequestMapping(value = "/retrieve/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_JSON_VALUE })

	public Book getEmployee(@PathVariable("empNo") long id) {
		return bookServiceImp.book(id);
	}

	@RequestMapping(value = "/addbook", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> addEmployee(@RequestBody Book book) {
		
		Book book1 = bookServiceImp.save(book);
		System.out.println("(Service Side) Creating employee: ");

		return new ResponseEntity<Book>(book1, HttpStatus.OK);

	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public Book updateEmployee(@RequestBody Book book, @PathVariable("id") long id) {

		System.out.println("(Service Side) Editing employee: " + book.getAuthor());

		return bookServiceImp.update(id, book);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public void deleteEmployee(@PathVariable("id") long id) {

		System.out.println("(Service Side) Deleting employee: "+id);
   
		 bookServiceImp.delete(id);
		
	}

}
