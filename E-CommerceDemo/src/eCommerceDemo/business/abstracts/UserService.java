package eCommerceDemo.business.abstracts;

//import java.util.List;

import eCommerceDemo.entities.concreates.User;

public interface UserService {
	
	void register(User user);
	void logIn(String email,String password);
	void logOut();
	/*
	 void add(User user);
	 
	void delete(User user);
	void update(User user);
	
	List<User> getAll();
	
	User getById(int id);
	*/
}
