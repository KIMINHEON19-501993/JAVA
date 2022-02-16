package emp;

public class EmpMain {

	public static void main(String[] args) {
		// db<---DAO를 통해 VO를 가져와서 main에서 출력

		EmpDao dao = new EmpDao();

//		System.out.println("*************** 모든 사원 출력하기 ***************");
//		List<EmpVo> list = dao.getEmpList();
//		for (EmpVo ob : list) {
//			System.out.print("이름 : " + ob.getEname() + "\t");
//			System.out.print("부서 : " + ob.getDept() + "\t");
//			System.out.println("급여 : " + ob.getSalary());
//		}
		
		System.out.println("*************** 뽀로로 사원 출력하기 ***************");

		
		
		EmpVo vo = dao.getEmp("뽀로로");
		
		if (vo == null) {
			System.out.println("찾는 사람이 없어요.");				
		}else {
			System.out.print("이름 : " + vo.getEname() + "\t");
			System.out.print("부서 : " + vo.getDept() + "\t");
			System.out.println("급여 : " + vo.getSalary());
		}
			
	}
}
