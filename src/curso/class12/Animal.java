package curso.class12;

public abstract class Animal {
	private double weight;
	private int age;
	private int members;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	
	public abstract void move();
	
	public abstract void eat();
	
	public abstract void makeSound();
	
	
}
