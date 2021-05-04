package kodlama_io_ReCap;

public class StudentManager extends UserManager{
	//Yorum yapacak kullanýcý ve yapacaðýnýz yorumu parametre olarak gönderiyoruz.
	public void sendComment(User user,String comment) {
		System.out.println(user.getFirstName()+" kullanýcýsý yorum yaptý. Yorum : "+comment);
	}
	
	//Cevap yazacaðýnýz yorumun sahibini ve cevabý parametre ile gönderiyoruz
	@Override
	public void Answer(User commentUser,User answerUser,String answer) {
		System.out.println(commentUser.getFirstName()+" kullanýcýsýna "+answerUser.getFirstName()+" tarafýndan cevap verildi. Cevap : "+answer);
	}
}
