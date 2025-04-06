package curso.class09;

public class Class09 {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		Book[] books = new Book[3];
		
		people[0] = new Person("Pedro", 22,"M");
		people[1] = new Person("Maria", 25, "F");
		
		books[0] = new Book("Learning Java", "José da Silva", 300, people[0]);
		books[1] = new Book("OOP for beginners", "Pedro Paulo", 500, people[1]);
		books[2] = new Book("Advanced Java", "Maria Candido", 800, people[0]);
		
		books[0].open();
		books[0].advancePage();
		books[0].leafThrough(0);
		books[0].close();
		System.out.println(books[0].details());
		
	}
}
