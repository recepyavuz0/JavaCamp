package eCommerceDemo.business.concreates;

import eCommerceDemo.core.validation.*;
import eCommerceDemo.core.verificationEmail.Verification;
import eCommerceDemo.adapter.abstracts.RegisterService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.entities.concreates.User;

public class UserManager implements UserService{

	RegisterService registerService;
	
	public UserManager(RegisterService registerService) {
		this.registerService=registerService;
	}
	@Override
	public void register(User user) {
		if (Rules.validOfName(user.getFirstName(),user.getLastName())&&
				Rules.validOfPassword(user.getPassword())&&
				Rules.validOfEmailFormat(user.getEmail())) {
			registerService.register(user);	
			Verification.sendVerificationEmail(user.getEmail());
		}
		
	}
	@Override
	public void logIn(String email, String password) {
		registerService.logIn(email, password);
	}
	@Override
	public void logOut() {
		System.out.println("Cikis yapildi.");
	}
}
