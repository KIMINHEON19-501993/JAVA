package test;

public class User {
	private String id;
	private String pw;
	private String name;
	private String point;
	
	public User() {
		// TODO 磊悼 积己等 积己磊 胶庞
	}

	public User(String id, String pw, String name, String point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public String getPoint() {
		return point;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoint(String point) {
		this.point = point;
	}
	
	
}
