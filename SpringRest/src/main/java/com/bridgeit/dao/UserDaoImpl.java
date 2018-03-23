/*package com.bridgeit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bridgeit.model.User;

public class UserDaoImpl implements userDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public void addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	}
}
*/