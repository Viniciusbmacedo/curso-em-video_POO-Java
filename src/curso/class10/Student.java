package curso.class10;

public class Student extends Person{
	private int registration;
	private String course;

	public int getEnrollment() {
		return registration;
	}

	public void setEnrollment(int enrollment) {
		this.registration = enrollment;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void cancelRegistration() {
		System.out.println("Registration canceled");
	}
	
	
}
