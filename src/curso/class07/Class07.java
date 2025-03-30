package curso.class07;

public class Class07 {

	public static void main(String[] args) {

		Fighter[] fighter = new Fighter[6];
		fighter[0] = new Fighter("Pretty Boy", "France", 31, 1.75, 68.9, 11, 2, 1);
		fighter[1] = new Fighter("Putscript", "Brazil", 29, 1.68, 57.8, 14, 2, 3);
		fighter[2] = new Fighter("Snapshadow", "USA", 35, 1.65, 80.9, 12, 2, 1);
		fighter[3] = new Fighter("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
		fighter[4] = new Fighter("Ufocobol", "Brazil", 37, 1.70, 119.3, 5, 4, 3);
		fighter[5] = new Fighter("Nerdaard", "USA", 30, 1.81, 105.7, 12, 2, 4);
		
//		for(int i = 0; i < fighter.length; i++) {
//			System.out.println(fighter[i].status());
//		}
//		System.out.println(fighter[0].status());
//		System.out.println(fighter[1].status());
		Fight match01 = new Fight(fighter[0], fighter[1]);
		match01.fight();
		System.out.println(fighter[0].status());
		System.out.println(fighter[1].status());
		
	}

}
