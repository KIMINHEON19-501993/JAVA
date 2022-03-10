package object;
/*
 * 이름은 뽀로로 이고 개발부에 근무하며 급여는 1500000원, 입사성적은 85.75점 입니다. 
 * 
 * setEmployee()를 이용하여 값을 대입하고 출력 하세요.
 * 사원이름 : 진달래
 * 근무부서 : 총무부
 * 받는급여 : 1500000원
 * 입사성적 : 85.75점
 */

public class ObjectEx4 {

	public static void main(String[] args) {
		Employee em = new Employee(); // 변수 선언
//		em.setName("뽀로로"); // 초기화, 값의 대입
//		em.setDept("개발부");
//		em.setPay(1500000);
//		em.setScore(85.75);
//		
//		System.out.println(em.toString());

		em = new Employee();
		System.out.println(em.toString()); //em이 초기화된 상태의 출력 값
		em.setEmployee("진달래", "총무부", 1500000, 85.75); // 초기화, 값의 대입

		System.out.println("사원이름 : " + em.getName());
		System.out.println("근무부서 : " + em.getDept());
		System.out.println("받는급여 : " + em.getPay() + "원");
		System.out.println("입사성적 : " + em.getScore() + "점");
	}

}
