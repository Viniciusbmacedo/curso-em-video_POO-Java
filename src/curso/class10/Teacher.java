package curso.class10;

public class Teacher extends Person {

	private String specialization;
	private double wage;
	
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public void WageRaise(double raise) {
		this.setWage(this.getWage() + raise);
	}
	
	
}
