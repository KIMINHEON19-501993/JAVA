package employee;

/*
 * 사원번호 : 101
 * 사원이름 : 뽀로로
 * 내선번호 : 1234
 * 기본급여 : 2500000
 * 보너수 + 수당 : 450000
 * 지급금액 : 2950000원
 * 
 * 사원번호 : 201
 * 사원이름 : 크롱
 * 내선번호 : 5378
 * 기본급여 : 1500000
 * 보너수 + 수당 : 225000
 * 지급금액 : 1725000원
 */
public class EmpMain {
	public static void main(String[] args) {
		Emp mp = null;
		
		mp = new Engineer(101,"뽀로롱","1234");
		mp.setSalary(2500000);
		mp.setBonus(350000);
		System.out.println(mp.toString());
		
		System.out.println();
		
		mp = new Developer(201,"크롱","5678");
		mp.setSalary(1500000);
		mp.setBonus(75000);
		System.out.println(mp.toString());
		
//		Engineer eng = new Engineer(101,"뽀로롱","1234");
//		eng.setSalary(2500000);
//		eng.setBonus(350000);
//		System.out.println(eng.toString());
//		
//		System.out.println();
//		
//		Developer dev = new Developer(201,"크롱","5678");
//		dev.setSalary(1500000);
//		dev.setBonus(75000);
//		System.out.println(dev.toString());
		
		
	}
}
