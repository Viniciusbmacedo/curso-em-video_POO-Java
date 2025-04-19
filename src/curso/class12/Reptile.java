package curso.class12;

public class Reptile extends Animal {
	private String scaleColor;
	
	public String getScaleColor() {
		return this.scaleColor;
	}
	public void setScaleColor(String scaleColor) {
		this.scaleColor = scaleColor;
	}
	
	@Override
	public void move() {
		System.out.println("Crawling");
	}
	@Override
	public void eat() {
		System.out.println("Eating vegetables");
	}
	@Override
	public void makeSound() {
		System.out.println("Reptile sound");
	}
	
	
}
