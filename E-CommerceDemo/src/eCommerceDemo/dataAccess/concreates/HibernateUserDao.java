package eCommerceDemo.dataAccess.concreates;

import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concreates.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi. Eklenen: "+user.getEmail());
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silinen. Silinen: "+user.getEmail());
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile guncellendi. Guncellenen: "+user.getEmail());
	}

	@Override
	public List<User> getAll() {
		System.out.println("Tum veriler Hibernate ile listelendi.");
		return null;
	}

	@Override
	public User getById(int id) {
		System.out.println("Id'ye gore kullanici Hibernate ile guncellendi.");
		return null;
	}

}
