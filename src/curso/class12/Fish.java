package curso.class12;

public class Fish extends Animal {
	private String scaleColor;

	public String getScaleColor() {
		return scaleColor;
	}

	public void setScaleColor(String scaleColor) {
		this.scaleColor = scaleColor;
	}
	
	public void blowBubbles() {
		System.out.println("Blew a bubble");
	}

	@Override
	public void move() {
		System.out.println("Swimming");
	}

	@Override
	public void eat() {
		System.out.println("Eating substances");
	}

	@Override
	public void makeSound() {
		System.out.println("Fish doesn't make sound");
		
	}
}
