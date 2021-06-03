package com.kyle.user;

public class UserService {
	
	User u = new User();

	public User checkUser(String username, String password) {
		//read in users
		u.setUsername("kmaxc3211");
		u.setPassword("password");
		u.setId(256);
		if (u.getUsername().equals(username)) {
			System.out.println("yup username");
			if (u.getPassword().equals(password)) {
				System.out.println("yup password");
				return u;
			} else 
				System.out.println("not password");
		} else 
			System.out.println("nope username");
		
		return null;
	}
}
