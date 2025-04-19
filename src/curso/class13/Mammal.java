package curso.class13;

public class Mammal extends Animal {
	protected String furColor;
	
	@Override
	public void makeSound() {
		System.out.println("Mammal sound");
	}
}
