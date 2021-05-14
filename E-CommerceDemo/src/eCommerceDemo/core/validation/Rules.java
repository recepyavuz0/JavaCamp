package eCommerceDemo.core.validation;

public class Rules {
	public static boolean validOfName(String firstName,String lastName){
		if (firstName.length()>2 && lastName.length()>2) {
			return true;
		}
		System.out.println("Isim ve Soyisim en az 3 karakter olmalidir.");
		return false;
	}
	
	public static boolean validOfPassword(String password) {
		if (password.length()>=6) {
			return true;
		}
		System.out.println("Sifre en az 6 karakter olmalidir.");
		return false;
	}
	// Regex ile Yapilacak
	public static boolean validOfEmailFormat(String email) {
		
		if(email.matches("^(.+)@(.+)$")) {
			return true;
		}
		System.out.println("Email formati dogru deðil.\nGirilen Email: "+email);
		return false;
	}	
}
