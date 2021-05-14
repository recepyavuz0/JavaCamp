package eCommerceDemo;

import eCommerceDemo.adapter.concreate.*;
import eCommerceDemo.business.concreates.UserManager;
import eCommerceDemo.core.verificationEmail.Verification;
import eCommerceDemo.dataAccess.concreates.InMemoryUserDao;
import eCommerceDemo.entities.concreates.User;

public class Main {

	public static void main(String[] args) {
		User user=new User(1, "Recep","Yavuz","recep@gmail.com", "123456");
		User user2=new User(2, "Ali","Can","aligmail.com", "123456");
		User user3=new User(3, "Can","Demir","ali@gmail.com", "123456");
		
		UserManager userManager=new UserManager(new GoogleRegisterManager(new InMemoryUserDao()));
		
		System.out.println("<<<<<KULLANICI EKLEME>>>>>");
		userManager.register(user);
		System.out.println("----------------------------");
		userManager.register(user2);
		System.out.println("----------------------------");
		userManager.register(user3);
		
		System.out.println("------------ MAIL DOGRULAMA ---------------");
		Verification.confirmVerificationEmail(user.getEmail());
		
		System.out.println("------------ LOGIN ----------------");
		userManager.logIn("recep@gmail.com","123456");
		System.out.println("--------------------------------------");
		
		userManager.logIn("ali@hotmail.com","123456");
		
		System.out.println("----------------CIKIS----------------------");
		userManager.logOut();
		
	}

}
