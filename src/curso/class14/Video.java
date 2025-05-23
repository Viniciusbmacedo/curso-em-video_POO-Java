package curso.class14;

public class Video implements VideoActions{
	private String title;
	private int score;
	private int views;
	private int likes;
	private boolean playing;
	
	public Video(String title) {
		this.title = title;
		this.score = 0;
		this.views = 0;
		this.likes = 0;
		this.playing = false;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		int newScore;
		newScore = (int) ((this.score + score)/this.views);
		this.score = newScore;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public boolean isPlaying() {
		return playing;
	}
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	@Override
	public void play() {
		this.playing = true;
		
	}
	@Override
	public void pause() {
		this.playing = false;
		
	}
	@Override
	public void like() {
		this.likes++;
		
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", score=" + score + ", views=" + views + ", likes=" + likes + ", playing="
				+ playing + "]";
	}
	
	
}
