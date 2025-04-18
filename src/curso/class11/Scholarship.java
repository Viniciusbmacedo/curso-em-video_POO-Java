package curso.class11;

public class Scholarship extends Student {
	private float scholarship;
	
	public float getScholarship() {
		return scholarship;
	}

	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}

	public void renewScholarship() {
		System.out.printf("Renew $s's scholarship!\n", this.getName());
	}
	
	@Override
	public void payFee() {
		System.out.printf("%s is a scholarship holder and has a discount on its monthly fee.", this.getName());
	}
}
