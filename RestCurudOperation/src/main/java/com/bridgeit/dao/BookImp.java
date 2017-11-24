package com.bridgeit.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeit.model.Book;

/**
 * @author GulabThakur
 * @this The implements of Ibook interface
 *
 */
@Repository
public class BookImp implements Ibook {

	@Autowired
	private SessionFactory sessionFactory;

	
	public Book insert(Book book) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		return book;
	}

	
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = session.byId(Book.class).load(id);
		session.delete(book);
	}

	
	public Book getBook9(long id) {
		return sessionFactory.getCurrentSession().get(Book.class, id);
	}

	
	public List<Book> getBooks() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Book> cbook = criteriaBuilder.createQuery(Book.class);
		Root<Book> root = cbook.from(Book.class);
		cbook.select(root);
		Query<Book> query = session.createQuery(cbook);
		return query.getResultList();
	}

	
	public Book update(long id,Book book) {
		Session session=sessionFactory.getCurrentSession();
		Book book2=session.byId(Book.class).load(id);
		book2.setAuthor(book.getAuthor());
		book2.setTitle(book.getTitle());
		session.flush();
		return book2;
	}

}
