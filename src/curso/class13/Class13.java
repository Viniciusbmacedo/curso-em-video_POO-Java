package curso.class13;

public class Class13 {
	public static void main(String[] args) {
		Mammal m = new Mammal();
		Wolf w = new Wolf();
		Dog d = new Dog();
		
		//Overrinding Polymorphism
		//When a subclass provides different implementation from a method that is alredy defined in its superclass
		m.makeSound();
		w.makeSound();
		d.makeSound();
		
		//Overloading Polymorphism
		//Same methods in the same class but different parameters
		d.react(false);
		d.react(20);
		d.react("Good boy!");
		d.react(4, 10);
	}
}
