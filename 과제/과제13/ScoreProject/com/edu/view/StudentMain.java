package com.edu.view;

import java.util.Scanner;

import com.edu.controller.StudentController;
import com.edu.entity.Student;

public class StudentMain {
	Scanner sc = null;
	StudentController control = null;
	Student entity = null;

	public StudentMain() {
		sc = new Scanner(System.in);
		control = new StudentController();
		entity = new Student();
	}

	public void menu() {
		int n;
		String name;
		String insert;
		while (true) {
			System.out.print("1.추가  2.삭제  3.전체보기  4.찾기  5.종료\n선택(1~5) : ");
			
			n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.print("이름 입력 : ");
				entity.setName(sc.next());
				System.out.print("국어 : ");
				entity.setKor(sc.nextInt());
				System.out.print("영어 : ");
				entity.setEng(sc.nextInt());
				System.out.print("수학 : ");
				entity.setMat(sc.nextInt());
				insert = control.insertStudent(entity);
				if (insert == null) {
					System.out.println("입력값에 오류가 있습니다.");
				}
				break;
			case 2:
				System.out.print("삭제할 대상 이름 입력 : ");
				name = sc.next();
				control.deleteStudent(name);
				break;
			case 3:
				
				control.getStudentList();
				break;
			case 4:
				System.out.print("찾는 사람 : ");
				name = sc.next();
				control.getStudent(name);
				break;
			case 5:
				System.out.println("**** 작업끝 ****");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new StudentMain().menu();
	}

}
