package curso.class12;

public class Mammal extends Animal {
	
	private String furColor;
	
	public String getFurColor() {
		return this.furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	@Override
	public void move() {
		System.out.println("Running");
	}

	@Override
	public void eat() {
		System.out.println("Breastfeeding");
	}

	@Override
	public void makeSound() {
		System.out.println("Mammal sound");
	}

}
