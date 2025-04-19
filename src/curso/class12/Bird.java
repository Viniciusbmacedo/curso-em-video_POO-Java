package curso.class12;

public class Bird extends Animal{
	private String featherColor;

	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}
	
	public void buildNest() {
		System.out.println("Built a nest");
	}

	@Override
	public void move() {
		System.out.println("Flying");
	}

	@Override
	public void eat() {
		System.out.println("Eating fruits");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Bird sound");
		
	}
	
}
