package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concreates.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	
	List<User> getAll();
	
	User getById(int id);
}
