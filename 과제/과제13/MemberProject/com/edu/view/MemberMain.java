package com.edu.view;

import java.util.Scanner;

import com.edu.controller.MemberController;
import com.edu.dao.MemberDAO;
import com.edu.entity.MemberEntity;

import common.MyConnectionPool;

public class MemberMain {
	
	MemberEntity entity = null;
	MemberController mc = null;
	Scanner sc = null;
	String name,phone;
	public MemberMain() {
		entity = new MemberEntity();
		mc = new MemberController();
		sc = new Scanner(System.in);
	}
	
	public void menu() {
		
		while (true) {
			System.out.print("1.추가  2.삭제  3.전체보기  4.찾기  5.종료\n선택(1~5) : ");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.print("이름 입력 : ");
				entity.setName(sc.next());
				System.out.print("번호 입력 : ");
				entity.setPhone(sc.next());
				mc.insertMember(entity);
				break;
			case 2:
				System.out.print("삭제할 대상 이름 입력 : ");
				name = sc.next();
				mc.deleteMember(name);
				break;
			case 3:
				mc.getMemberList();
				break;
			case 4:
				System.out.print("찾는 사람 : ");
				name = sc.next();
				mc.getMember(name);
				break;
			case 5:
				System.out.println("**** 작업끝 ****");
				System.exit(0);
			}
		}
		
	}
	public static void main(String[] args) {
		new MemberMain().menu();

	}

}
