package com.edu.view;

import java.util.ArrayList;

import com.edu.entity.MemberEntity;



public class MemberView {

	public void getMemberList(ArrayList<MemberEntity> list) {
		if (list != null) {
			for (MemberEntity entity : list) {
				System.out.print(entity.getIdx() + "\t");
				System.out.print(entity.getName() + "\t");
				System.out.print(entity.getPhone() + "\n");
			}
		}else {
			System.out.println("출력할 데이터가 없습니다.");
		}
		
	}

	public void insertMember(int n) {
		if (n > 0) {
			System.out.println(n + "건의 데이터가 추가 되었습니다.");
		}else
			System.out.println("데이터가 추가에 실패했습니다.");
		
	}

	public void deleteMember(int n) {
		if (n > 0) {
			System.out.println(n + "건의 데이터가 삭제 되었습니다.");
		}else
			System.out.println("데이터가 삭제에 실패했습니다.");
		
	}

	public void getMember(MemberEntity entity) {
		if (entity != null) {
			System.out.print(entity.getIdx() + "\t");
			System.out.print(entity.getName() + "\t");
			System.out.print(entity.getPhone() + "\n");
		}else
			System.out.println("찾는 사람이 없어");
		
	}

		
}
