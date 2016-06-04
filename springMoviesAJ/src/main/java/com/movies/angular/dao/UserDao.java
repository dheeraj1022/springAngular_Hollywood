package com.movies.angular.dao;

import java.util.List;

import com.movies.angular.Model.User;

public interface UserDao {
	
	public void insertUser();
	public User getUser(String username);
	public List<User> getAllUsers();
	public void deleteUser(String username);
	public void updateuser(String username);

}
