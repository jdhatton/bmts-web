package services;

import java.util.List;

import com.google.inject.Inject;

import data.db.beans.User;
import data.db.dao.UserDao;

public class UserServiceImpl implements UserService {
		
	UserDao userDao;

	@Inject
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;		
	}
	
	public List<User> getAllUsers() {			
		return userDao.findAll();		
	}
	
	public User getUser( long Id) {		
		return userDao.findById(Id);		
	}
	
}
