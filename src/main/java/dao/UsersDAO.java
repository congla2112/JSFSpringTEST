package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Users;

public class UsersDAO {
	private SessionFactory sessionFactory;
	public List<Users> listUsers(){
		Session session = sessionFactory.getCurrentSession();
		List<Users> usersList = session.createQuery("from USERS").list();
		return usersList;
	}
}
