package com.student;

/*
 * [ 문제 2 ] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오
3개의 Student 객체를 생성 하여 배열에 저장 한 후 3개의 객체 중 가장 큰 신장과 몸무게, 나이의 평균을 구한다
1. 사용 데이터
아래와 같이 3개의 Student Object를 생성 하여 프로그램을 동작 시킨다
name 나이 신장 몸무게
홍길동 15 170 80
한사람 13 180 70
임걱정 16 175 65
 */
public class StudentTest {

	public static void main(String[] args) {
		Student st[] = new Student[3];
		double avg = 0;
		int sum = 0;
		int max;
		int min;
		int j = 0,k = 0;
		// Student 객체를 3개 생성하여 배열에 넣는다
		st[0] = new Student("홍길동", 15, 170, 80);
		st[1] = new Student("한사람", 13, 180, 70);
		st[2] = new Student("임걱정", 16, 175, 65);

		// 배열에 있는 객체 정보를 모두 출력 한다 – for문을 이용할 것, studentInfo 함수 사용
		System.out.println("이름\t나이\t신장\t몸무게");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].studentInfo());
		}
		// Student 객체들의 나이의 평균 출력
		for (int i = 0; i < st.length; i++) {
			sum += st[i].getAge();
		}
		avg = (double) sum / st.length;
		System.out.println("나이 평균 : " + String.format("%.3f", avg));
		// Student 객체들의 신장의 평균 출력
		for (int i = 0; i < st.length; i++) {
			sum += st[i].getHeight();
		}
		avg = (double) sum / st.length;
		System.out.println("나이 평균 : " + String.format("%.3f", avg));
		// Student 객체들의 몸무게의 평균 출력
		for (int i = 0; i < st.length; i++) {
			sum += st[i].getWeight();
		}
		avg = (double) sum / st.length;
		System.out.println("나이 평균 : " + String.format("%.3f", avg));
		// 학생들 중 나이가 가장 적은 학생과 많은 학생 출력
		max = 0;
		min = 1000;
		for (int i = 0; i < st.length; i++) {
			if (max < st[i].getAge()) {
				max = st[i].getAge();
				j=i;
			}
			if (min > st[i].getAge()) {
				min = st[i].getAge();
				k=i;
			}
		}
		System.out.println("나이가 가장 많은 학생 : " + st[j].getName());
		System.out.println("나이가 가장 적은 학생 : " + st[k].getName());

		// 학생들 중 신장이 가장 적은 학생과 큰 학생 출력
		max = 0;
		min = 1000;
		for (int i = 0; i < st.length; i++) {
			if (max < st[i].getHeight()) {
				max = st[i].getHeight();
				j=i;
			}
			if (min > st[i].getHeight()) {
				min = st[i].getHeight();
				k=i;
			}
		}
		System.out.println("신장이 가장 큰 학생 : " + st[j].getName());
		System.out.println("신장이 가장 작은 학생 : " + st[k].getName());

		// 학생들 중 몸무게가 가장 적은 학생과 많이 나가는 학생 출력
		max = 0;
		min = 1000;
		for (int i = 0; i < st.length; i++) {
			if (max < st[i].getWeight()) {
				max = st[i].getWeight();
				j=i;
			}
			if (min > st[i].getWeight()) {
				min = st[i].getWeight();
				k=i;
			}
		}
		System.out.println("몸무게가 가장 많은 학생 : " + st[j].getName());
		System.out.println("몸무게가 가장 적은 학생 : " + st[k].getName());

	}

}
