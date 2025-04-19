package curso.class12;

public class Class12 {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		Reptile r = new Reptile();
		Fish f = new Fish();
		Bird b = new Bird();
		
		
		System.out.println("Mammal");
		m.setWeight(35.3f);
		m.setFurColor("Brown");
		m.eat();
		m.move();
		m.makeSound();
		System.out.println("");
		
		System.out.println("Reptile");
		r.setWeight(5.3f);
		r.eat();
		r.move();
		r.makeSound();
		System.out.println("");
		
		System.out.println("Fish");
		f.setWeight(1.25f);
		f.eat();
		f.move();
		f.makeSound();
		System.out.println("");
		
		System.out.println("Bird");
		b.setWeight(3.3f);
		b.eat();
		b.move();
		b.makeSound();
		System.out.println("");
	}

}
