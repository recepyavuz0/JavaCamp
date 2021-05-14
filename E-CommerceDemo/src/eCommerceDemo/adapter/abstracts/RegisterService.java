package eCommerceDemo.adapter.abstracts;

import eCommerceDemo.entities.concreates.User;

public interface RegisterService {
	public void register(User user);
	public void logIn(String email,String password);
}
