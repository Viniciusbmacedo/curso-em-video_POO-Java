package curso.class14;

public class Visualization {
	private Locust spectator;
	private Video movie;
	
	public Visualization(Locust spectator, Video movie) {
		this.spectator = spectator;
		this.movie = movie;
		this.spectator.watchedOneMore();
		this.movie.setViews(this.movie.getViews() + 1);
	}

	public Locust getSpectator() {
		return spectator;
	}

	public void setSpectator(Locust spectator) {
		this.spectator = spectator;
	}

	public Video getMovie() {
		return movie;
	}

	public void setMovie(Video movie) {
		this.movie = movie;
	}

	public void rate() {
		this.movie.setScore(5);
	}
	
	public void rate(int grade) {
		this.movie.setScore(grade);
	}
	
	public void rate(float perc) {
		int value = 0;
		if (perc <= 20) {
			value = 3;
		} else if (perc <= 50) {
			value = 5;
		} else if (perc <= 90) {
			value = 9;
		} else { 
			value = 10;
		}
		this.movie.setScore(value);
	}
	
	@Override
	public String toString() {
		return "Visualization [spectator=" + spectator + ", movie=" + movie + "]";
	}
	
	
	
}
