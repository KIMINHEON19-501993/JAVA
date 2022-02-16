package constructor;

public class ConstructorEx6 {
	
	public static void main(String[] args) {
//		Student st = new Student("둘리",100,100,100);
//		System.out.println(st.toString());
		
		Student st1 = new Student();
		st1.setName("홍길동");
		st1.setKor(95);
		st1.setEng(85);
		st1.setMat(73);
		System.out.println(st1.toString());
		
		//인자 4개 생성자를 이용하여 "뽀로로", 90,75,88을 대입한후
		//getter를 이요하여 출력
		Student st2 = new Student("뽀로로", 90,75,88);
		System.out.println("이름 :" + st2.getName()
							+"\n국어 : " + st2.getKor()
							+"\n영어 : " + st2.getEng()
							+"\n수학 : " + st2.getMat()
							+"\n총점 : " + st2.getTotal()
							+"\n평균 : " + String.format("%.2f",st2.getAvg())
							+"\n학점 : " + st2.getGrade());
	}
}
