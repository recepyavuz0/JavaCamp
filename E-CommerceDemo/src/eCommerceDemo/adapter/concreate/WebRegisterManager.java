package eCommerceDemo.adapter.concreate;

import eCommerceDemo.adapter.abstracts.RegisterService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concreates.User;

public class WebRegisterManager implements RegisterService {
	UserDao userDao;
	
	public WebRegisterManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		System.out.println(user.getEmail()+" adresi web sitesi ile uye oldu.");
		userDao.add(user);
	}

	@Override
	public void logIn(String email, String password) {
		System.out.println(email+" adresi web site basarili giris yapti.");
		for(User user:userDao.getAll()) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println(email+" ile giris yapildi.");
				return;
			}
		}
		System.out.println("Girilen bilgileri kontrol ediniz.");
	}
}
