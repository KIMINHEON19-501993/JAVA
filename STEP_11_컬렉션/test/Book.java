package test;

public class Book {
	private String title;
	private String author;
	private int page;
	
	public Book() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Book(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPage() {
		return page;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPage(int page) {
		this.page = page;
	}



	
	
	
}
