package com.renam.portal.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.renam.portal.domain.Comment;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insertRow(Comment comment) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(comment);
		tx.commit();
		Serializable id = session.getIdentifier(comment);
		session.close();
		return (Integer) id;
	}

	@Override
	public List<Comment> getList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Comment> commentList = session.createQuery("from comment").list();
		session.close();
		return commentList;
	}

	@Override
	public Comment getRowById(int id) {
		Session session = sessionFactory.openSession();
		Comment Comment = (Comment) session.load(Comment.class, id);
		return Comment;
	}

	@Override
	public int updateRow(Comment Comment) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(Comment);
		tx.commit();
		Serializable id = session.getIdentifier(Comment);
		session.close();
		return (Integer) id;
	}

	@Override
	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Comment Comment = (Comment) session.load(Comment.class, id);
		session.delete(Comment);
		tx.commit();
		Serializable ids = session.getIdentifier(Comment);
		session.close();
		return (Integer) ids;
	}

}
