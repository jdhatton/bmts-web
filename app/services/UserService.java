package services;

import java.util.List;

import data.db.beans.User;
import data.db.dao.UserDaoImpl;

public interface UserService {

	public List<User> getAllUsers() ;
	
	public User getUser( long Id);
	
}
