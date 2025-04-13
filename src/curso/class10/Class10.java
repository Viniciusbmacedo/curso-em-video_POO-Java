package curso.class10;

public class Class10 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Student p2 = new Student();
		Teacher p3 = new Teacher();
		Employee p4 = new Employee();
		
		p1.setName("Pedro");
		p2.setName("Maria");
		p3.setName("Cláudio");
		p4.setName("Fabiana");
		
		p1.setGender("M");
		p4.setGender("F");
		p2.setAge(18);
		
		p2.setCourse("Civil Engeenier");
		p3.setWage(2000.75);
		p4.setSector("Stock");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
