package com.elite.test02;
/*
 * [ 문제 2 ] 다음과 같은 조건을 만족하는 프로그램을 작성하시오
Human 클래스를 상속받은 Student 클래스를 이용하여 프로그램 한다. 3개의 Student 객체를 생성하여 배열에 저장한 후, 각 객체의 모든 정보를 출력한다. 1. 사용 데이터
아래와 같이 3개의 Student Object를 생성하여 프로그램을 동작 시킨다. name 나이 신장 몸무게 학번 전공
홍길동 15 171 81 201101 영문
한사람 13 183 72 201102 건축
임걱정 16 175 65 201103 무용

 */
public class StudentTest {

	public static void main(String[] args) {
		Student arrays[] = new Student[3];
		
		arrays[0] = new Student("홍길동", 15, 171, 81, "201101" ,"영문");
		arrays[1] = new Student("한사람", 13, 183, 72, "201102" ,"건축");
		arrays[2] = new Student("임걱정", 16, 175, 65, "201103" ,"무용");
		
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i].printInformation());
		}
	}

}
