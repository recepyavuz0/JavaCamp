package kodlama_io_ReCap;

public class InstructorManager extends UserManager{
	
	//Cevap yazacaðýnýz yorumun sahibini ve cevabý parametre ile gönderiyoruz
	@Override
	public void Answer(User commentUser,User answerInstructor,String answer) {
		System.out.println(commentUser.getFirstName()+" kullanýcýsýna eðitmen "+answerInstructor.getFirstName()+" tarafýndan cevap verildi. Cevap : "+answer);
	}
}
