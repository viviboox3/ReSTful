package org.vivian.itemize.receipt.database;

import java.util.HashMap;
import java.util.Map;

import org.vivian.itemize.receipt.model.Receipt;
import org.vivian.itemize.receipt.model.User;

// mock database
public class DatabaseClass {

	private static Map<Long, User> users;
	static {
		users = new HashMap<>();
		
		User u1 = new User(1L, "John", "Smith", "111 1st Street, NY, NY, 10001, US");
		User u2 = new User(2L, "Eric", "Johnson", "53 Utica Ave, Suite #221, Chicago, IL, 60647, US");
		User u3 = new User(3L, "Daniel", "Blaine", "221B Baker St, London, NW1 6XE, UK");
		
		users.put(1L, u1);
		users.put(2L, u2);
		users.put(3L, u3);
	}
	
	public static Map<Long, User> getUsers() {
		return users;
	}

}
