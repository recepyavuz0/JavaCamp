package kodlama_io_ReCap;

public class Student extends User{
	String course;
	
	public Student(int id,String firstName,String lastName,String email,String password,String course) {
		super(id,firstName,lastName,email,password);
		this.course=course;
	}
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
