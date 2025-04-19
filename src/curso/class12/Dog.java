package curso.class12;

public class Dog extends Mammal {
	public void baryBone() {
		System.out.println("Buried the bone");
	}
	
	public void wagTail() {
		System.out.println("Wagged his tail");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Barked");
	}
}
