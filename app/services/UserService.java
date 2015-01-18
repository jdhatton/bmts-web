package services;

import java.util.List;

import data.db.beans.User;
import data.db.dao.UserDao;

public class UserService {

	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	
	public List<User> getAllUsers() {		
		return userDao.findAll();		
	}
	
	public User getUser( long Id) {		
		return userDao.findById(Id);		
	}
	
}
