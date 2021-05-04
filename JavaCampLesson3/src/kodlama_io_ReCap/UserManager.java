package kodlama_io_ReCap;

public class UserManager {

	public void Add(User user) {
		System.out.println(user.getId()+" Eklendi");
	}
	
	public void AddMultiple(User[] users) {
		for(User user:users) {
			this.Add(user);
		}
	}
	public void Delete(User user) {
		System.out.println(user.getId()+" Silindi");
	}
	
	public void Update(User user) {
		System.out.println(user.getId()+" Güncellendi");
	}
	public void Answer(User commentUser,User answerUser,String answer) {
		
	}
}
