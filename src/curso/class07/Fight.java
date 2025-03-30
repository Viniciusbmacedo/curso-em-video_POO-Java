package curso.class07;

import java.util.Random;

public class Fight {
	private Fighter challenged;
	private Fighter challenging;
	private int rounds;
	private boolean approved;
	
	public Fight(Fighter challenged, Fighter challenging) {
		super();
		this.challenged = challenged;
		this.challenging = challenging;
		this.scheduleFight(challenged, challenging);
	}
	
	
	public Fighter getChallenged() {
		return challenged;
	}
	public void setChallenged(Fighter challenged) {
		this.challenged = challenged;
	}
	public Fighter getChallenging() {
		return challenging;
	}
	public void setChallenging(Fighter challenging) {
		this.challenging = challenging;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isApproved() {
		return this.approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public void scheduleFight(Fighter challenged, Fighter challenging) {
		if(challenged != challenging && 
		   challenged.getCategory().equalsIgnoreCase(challenging.getCategory())) {
			this.setApproved(true);
			System.out.println("Fight scheduled for next Saturday!!\n");
		} else {
			this.setApproved(false);
			System.out.println("The fight can't happen!!\n");
		}
	}
	
	public void fight() {	
		if(this.isApproved()) {
			System.out.println(challenged.introduce());
			System.out.println(challenging.introduce());
			Random random = new Random();
			int winner = random.nextInt(3);
			switch(winner) {
			case 0: // draw
				challenged.toDraw();;
				challenging.toDraw();;
				System.out.println("It was a draw!\n");
				break;
			case 1: //challenged victory
				challenged.winFight();
				challenging.loseFight();
				System.out.println("The winner: " + challenged.getName().toUpperCase() + "!!\n");
				break;
			case 2: // challenging victory
				challenging.winFight();
				challenged.loseFight();
				System.out.println("The winner: " + challenging.getName().toUpperCase() + "!!\n");
				break;
			}
		} else {
			System.out.println("The fight can't happen!!\n");
		}
	}
	
	
}
