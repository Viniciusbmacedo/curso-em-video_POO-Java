package curso.class12;

public class Kangaroo extends Mammal {
	
	public void useBag() {
		System.out.println("Put the puppt on the bag");
	}
	
	@Override
	public void move() {
		System.out.println("Jumping");
	}
}
