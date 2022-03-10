package test;

//비즈니스 로직
public class UserProc {
	
	/*getLoginUser()
	 * 매개변수로 들어온 id,,pw를 "pororo", "1234"와 비교하여 
	 * 맟으면 entity객체를 만들어
	 * setter를 통해 id,pw "뽀로로", 89.97을 대입하세요
	 * 
	 * entity를 리턴 하세요.
	 */
	public UserProc() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public User getLoginUser(String id, String pw) {
		
		if(id.equals("pororo") && pw.equals("1234")) {
			User entity = new User();
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("뽀로로");
			entity.setPoint("87.97");
//			entity.getId();
//			entity.getPw();
//			entity.getName();
//			entity.getPoint();
			
			return entity;

		}else return null;
		
	}
	
}
