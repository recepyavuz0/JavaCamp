package eCommerceDemo.core.verificationEmail;

public class Verification {

		public static void sendVerificationEmail(String email) {
			System.out.println(email+" adresine dogrulama maili gonderilmistir.");
		}
		
		public static void confirmVerificationEmail(String email) {
			System.out.println(email+" adresi dogrulanmistir.");
		}
}
