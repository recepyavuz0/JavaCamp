package kodlama_io_ReCap;

public class Instructor extends User {
	int numberOfCourse;

	public Instructor(int id,String firstName,String lastName,String email,String password,int numberOfCourse) {
		super(id,firstName,lastName,email,password);
		this.numberOfCourse=numberOfCourse;
	}
	
	public void setNumberOfCourse(int numberOfCourse) {
		this.numberOfCourse=numberOfCourse;
	}
	public int getNumberOfCourse() {
		return numberOfCourse;
	}
}
