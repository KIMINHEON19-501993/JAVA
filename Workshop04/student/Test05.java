package student;

public class Test05 {

	public static void main(String[] args) {
//		[ 문제 5 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오. 
//		서로 다른 Student 객체를 생성 하여 모든 과목의 평균, 학점을 조회하는 프로그램을 작성 하시오. 
//		평균 점수가 100이하~90이상 점이면 A학점, 90미만~70이상 이면 B학점, 70미만~50이상C학점,
//		50미만~30이상 이면 D학점, 나머지는 F학점으로 화면에 출력 한다.

		Student st1 = new Student("Kim", 100, 90, 95, 89);
		Student st2 = new Student("Lee", 60, 70, 99, 98);
		Student st3 = new Student("Park", 68, 86, 60, 40);

		System.out.println(st1.getName() + " 평균 : " + st1.getAvg() + " 학점 : " + st1.getGrade() + "학점");
		System.out.println(st2.getName() + " 평균 : " + st2.getAvg() + " 학점 : " + st2.getGrade() + "학점");
		System.out.println(st3.getName() + " 평균 : " + st3.getAvg() + " 학점 : " + st3.getGrade() + "학점");

	}

}
