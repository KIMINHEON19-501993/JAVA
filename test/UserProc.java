package test;

//����Ͻ� ����
public class UserProc {
	
	/*getLoginUser()
	 * �Ű������� ���� id,,pw�� "pororo", "1234"�� ���Ͽ� 
	 * ������ entity��ü�� �����
	 * setter�� ���� id,pw "�Ƿη�", 89.97�� �����ϼ���
	 * 
	 * entity�� ���� �ϼ���.
	 */
	public UserProc() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public User getLoginUser(String id, String pw) {
		
		if(id.equals("pororo") && pw.equals("1234")) {
			User entity = new User();
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("�Ƿη�");
			entity.setPoint("87.97");
//			entity.getId();
//			entity.getPw();
//			entity.getName();
//			entity.getPoint();
			
			return entity;

		}else return null;
		
	}
	
}
