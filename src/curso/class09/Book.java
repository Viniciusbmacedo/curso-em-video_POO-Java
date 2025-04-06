package curso.class09;

public class Book implements Publication {
	private String title;
	private String author;
	private int totalPages;
	private int currentPage;
	private boolean open;
	private Person reader;
	
	public Book(String title, String author, int totalPages, Person reader) {
		super();
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
		this.reader = reader;
		this.open = false;
		this.currentPage = 0;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public Person getReader() {
		return reader;
	}
	public void setReader(Person reader) {
		this.reader = reader;
	}
	
	public String details() {
		return "Book [title=" + title + ", author=" + author + ", totalPages=" + totalPages + ", currentPage="
				+ currentPage + ", open=" + open + ", reader=" + reader.getName() + "]";
	}

	@Override
	public void open() {
		this.setOpen(true);
	}
	@Override
	public void close() {
		this.setOpen(false);
		
	}
	@Override
	public void leafThrough(int page) {
		if(page >= 0 && page <= this.totalPages) {
			this.setCurrentPage(page);
		}
	}
	@Override
	public void advancePage() {
		this.setCurrentPage(this.getCurrentPage() + 1); 
		
	}
	@Override
	public void backPage() {
		this.setCurrentPage(this.getCurrentPage() - 1); 
		
	}
	
	
}
