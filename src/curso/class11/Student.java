package curso.class11;

public class Student extends Person {
	private int enrollment;
	private String course;
	
	public int getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void payFee() {
		System.out.printf("The %s's fee has been paid!\n", this.getName());
	}
}
