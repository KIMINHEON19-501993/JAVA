package constructor;
/*
 * 클래스 명 : UserInfo
 * +name : String
 * +addr : String
 * UserInfo()
 * UserInfo(name : String, addr : String)
 * +getter
 * 
 * *****주소록***** <--디폴트 생성자에서 출력
 * 이름 : 원터   <--main 메서드에서 getter를 이용하여 출력
 * 주소 : 마포구 대흥동 
 */
class UserInfo {
	public String name;
	public String addr;
	UserInfo() {
//		this("원터", "마포구 대흥동");
		System.out.println("*****주소록*****");
	}
	UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	
}
public class ConstructorEx3 {

	public static void main(String[] args) {
//		UserInfo ui = new UserInfo();
//		System.out.println("이름 : " + ui.getName());
//		System.out.println("이름 : " + ui.getAddr());
		UserInfo ui = new UserInfo("원터", "마포구 대흥동");
		System.out.println("이름 : " + ui.getName());
		System.out.println("이름 : " + ui.getAddr());
	}

}
