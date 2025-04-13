package curso.class10;

public class Person {
	private String name;
	private int age;
	private String gender;
	
//	public Person(String name, int age, String gender) {
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public void birthday() {
		this.age++;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
