package curso.class10;

public class Employee extends Person{
	private String sector;
	private boolean working;
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean isWorking) {
		this.working = isWorking;
	}
	
	public void changeWork() {
		this.working =! this.working; 
	}
	
}
