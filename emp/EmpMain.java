package emp;

public class EmpMain {

	public static void main(String[] args) {
		// db<---DAO�� ���� VO�� �����ͼ� main���� ���

		EmpDao dao = new EmpDao();

//		System.out.println("*************** ��� ��� ����ϱ� ***************");
//		List<EmpVo> list = dao.getEmpList();
//		for (EmpVo ob : list) {
//			System.out.print("�̸� : " + ob.getEname() + "\t");
//			System.out.print("�μ� : " + ob.getDept() + "\t");
//			System.out.println("�޿� : " + ob.getSalary());
//		}
		
		System.out.println("*************** �Ƿη� ��� ����ϱ� ***************");

		
		
		EmpVo vo = dao.getEmp("�Ƿη�");
		
		if (vo == null) {
			System.out.println("ã�� ����� �����.");				
		}else {
			System.out.print("�̸� : " + vo.getEname() + "\t");
			System.out.print("�μ� : " + vo.getDept() + "\t");
			System.out.println("�޿� : " + vo.getSalary());
		}
			
	}
}
