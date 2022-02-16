package objectarray;
//디폴트 생성자, 인자 생성자, getter,setter
public class User {
	private String name;
	private String phone;
	
	public User() {
		
	}
	
	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
