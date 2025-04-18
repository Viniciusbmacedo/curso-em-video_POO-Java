package curso.class11;

public class Class11 {

	public static void main(String[] args) {
		
		Visitor v1 = new Visitor();
		
		v1.setName("Juvenal");
		v1.setAge(22);
		v1.setGender("M");
		System.out.println(v1.toString());

		Student s1 = new Student();
		s1.setName("Cláudio");
		s1.setEnrollment(11111);
		s1.setCourse("Computing");
		s1.setAge(16);
		s1.setGender("M");
		s1.payFee();
		
		Scholarship scho = new Scholarship();
		scho.setEnrollment(11112);
		scho.setName("Jubileu");
		scho.setScholarship(12.5f);
		scho.setGender("M");
		scho.payFee();
	}

}
