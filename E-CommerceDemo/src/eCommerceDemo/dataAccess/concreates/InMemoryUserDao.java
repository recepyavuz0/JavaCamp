package eCommerceDemo.dataAccess.concreates;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concreates.User;

public class InMemoryUserDao implements UserDao{
	List<User> users;
	public InMemoryUserDao() {
		users=new ArrayList<User>();
	}
	@Override
	public void add(User user) {
		for(User users:users) {
			if(users.getEmail().equals(user.getEmail())) {
				System.out.println("Bu email adresi ile kayitli hesap vardir.");
				return;
			}
		}
		users.add(user);
		System.out.println(user.getEmail()+" bellege eklendi.");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.getEmail()+" bellekten silindi.");
	}

	@Override
	public void update(User user) {
		int index =users.indexOf(user);
		users.set(index,user);
		System.out.println(user.getEmail()+" bellekte guncellendi.");
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getById(int id) {
		for(User user : this.users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

}
