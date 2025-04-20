package curso.class14;

public class Locust extends Person {
	private String login;
	private int totalWatched;
	
	public Locust(String name, int age, String gender, String login) {
		super(name, age, gender);
		this.login = login;
		this.totalWatched = 0;
		this.exp = 0;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalWatched() {
		return totalWatched;
	}
	public void setTotalWatched(int totalWatched) {
		this.totalWatched = totalWatched;
	}


	public void watchedOneMore() {
		this.totalWatched++;
		this.gainExp();
	}

	@Override
	public void gainExp() {
		this.exp++;
	}

	@Override
	public String toString() {
		return "Locust ["+ super.toString() + " login=" + login + ", totalWatched=" + totalWatched + "]";
	}
	
	
}
