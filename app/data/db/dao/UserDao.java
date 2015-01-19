package data.db.dao;

import java.util.List;

import data.db.beans.User;

public interface UserDao {

	public List<User> findAll() ;
	
	public User findById(long Id);
	
	public void addUser(User user) ;

	public void updateUser(User user);
}
