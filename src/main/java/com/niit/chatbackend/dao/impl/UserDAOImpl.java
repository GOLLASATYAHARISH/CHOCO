package com.niit.chatbackend.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.chatbackend.dao.UserDAO;
import com.niit.models.User;

@Repository("userDAO")
// calling dao instance inrepositoy
public class UserDAOImpl implements UserDAO {
	// @
	@Autowired
	public SessionFactory sessionFactory;
	// we will config at applicatiocontext congif

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		String hql="from User";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

	@Transactional
	public boolean save(User user) {
		// TODO Auto-generated method st
		try {
			sessionFactory.getCurrentSession().save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}

		return true;
	}

	@Transactional
	public boolean update(User user) {
		// TODO Auto-generated method stub
		// if getcutrent sesson not worsks th go with opensession .........
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	@Transactional
	public User get(String id) {
		// TODO Auto-generated method stub
		// it is silmilar to select * from User where id=""
		User user = (User) sessionFactory.getCurrentSession().get(id, User.class);

		return user;
	}

	@Transactional
	public User validate(String id, String password) {
		// TODO Auto-generated method stub
		// select *
		String hql = "from User where id= '" + id + "'and password ='" + password + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		User user = (User) query.uniqueResult();
		// unique is because only one with id and password

		return user;
	}

}
