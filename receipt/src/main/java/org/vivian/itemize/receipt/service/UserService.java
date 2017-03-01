package org.vivian.itemize.receipt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vivian.itemize.receipt.database.DatabaseClass;
import org.vivian.itemize.receipt.model.User;

// hard-coding provided "Existing Users" table 
public class UserService {

	private Map<Long, User> users = DatabaseClass.getUsers();	
	
	public UserService() {}
	
	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}
	
	public User getUser(long id) {
		return users.get(id);
	}
}
