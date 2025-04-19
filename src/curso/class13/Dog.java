package curso.class13;

public class Dog extends Wolf{
	
	@Override
	public void makeSound() {
		System.out.println("Au. au. au.");
	}
	
	//Overloading Polymorphism
	//Same methods in the same class but different parameters
	public void react(String text) {
		if(text.equalsIgnoreCase("Good boy!")) {
			System.out.println("Wagged his tail.");
		} else {
			System.out.println("Growl");
		}
	}
	
	public void react(int time) {
		if(time < 12) {
			System.out.println("Wagged his tail.");
		} else if (time >= 18) {
			System.out.println("Ignore");
		} else {
			System.out.println("Wagged his tail and bark");			
		}
	}
	
	public void react(boolean owner) {
		if(owner) {
			System.out.println("Wagged his tail.");
		} else {
			System.out.println("Growl");
		}
	}
	
	public void react(int age, double weight) {
		if (age < 5) {
		  if (weight < 10) {
			  System.out.println("Wagged his tail.");
		  } else {
			System.out.println("Growl");
		  }
		} else {
			if (weight < 10) {
				System.out.println("Growl");
			} else {
				System.out.println("Ignore");
			}
		}
	}
}
