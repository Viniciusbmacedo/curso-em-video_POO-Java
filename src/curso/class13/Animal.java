package curso.class13;

public abstract class Animal {
	protected float weight;
	protected int age;
	protected int members;
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
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



	public abstract void makeSound();
	
	}
