package curso.class07;

public class Fighter {
	private String name;
	private String nationality;
	private int age;
	private double height;
	private double weight;
	private String category;
	private int victories;
	private int defeats;
	private int draws;
	private boolean canFight;

	public Fighter(String name, String nationality, int age, double height, double weight, int victories,
			int defeats, int draws) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.height = height;
		this.setWeight(weight); 
		this.victories = victories;
		this.defeats = defeats;
		this.draws = draws;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		this.setCategory();
	}

	public String getCategory() {
		return category;
	}

	private void setCategory() {
		if(this.getWeight() < 52.2) {
			this.category = "Too light to fight!";
			this.setCanFight(false);
		} else if (this.getWeight() <= 70.3) {
			this.category = "Light";
			this.setCanFight(true);
		} else if (this.getWeight() <= 83.9) {
			this.category = "Middle-Weight";
			this.setCanFight(true);
		} else if (this.getWeight() <= 120.2) {
			this.category = "Heavy";
			this.setCanFight(true);
		} else {
			this.category = "Too heavy to fight!";
			this.setCanFight(false);
		}
	}

	public int getVictories() {
		return victories;
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}
	
	private void setCanFight(boolean canFight) {
		this.canFight = canFight;
	}
	
	public boolean isCanFight() {
		return this.canFight;
	}
	
	public String introduce() {
		return "Introducing, from " + this.getNationality() +
				", weighing " + this.getWeight() + "kg" +
				", with " + this.getHeight() + " height, " +
				this.getVictories() + " victories, " +
				this.getDefeats() + " defeats, " +
				this.getDraws() + " draws, " + 
				"..." + this.getName().toUpperCase() + "!!!";
	}
	
	public String status() {
		return "Name: " + this.getName() +
			   "\nAge: " + this.getAge() +
			   "\nFrom: " + this.getNationality() + 
			   "\nHeight: " + this.getHeight() +
			   "\nWeight: " + this.getWeight() +
			   "\nCategory: " + this.getCategory() +
			   "\nVictories: " + this.getVictories() + 
			   "\nDefeats: " + this.getDefeats() +
			   "\nDraws: " + this.getDraws()+ 
			   "\n" + ("-".repeat(20));
			   
	}
	
	public void winFight() {
		this.setVictories(getVictories() + 1); 
	}
	
	public void loseFight() {
		this.setDefeats(getDefeats() + 1);
	}
	
	public void toDraw() {
		this.setDraws(getDraws() + 1);
	}
	
	
}
