package com.edu.controller;

import java.util.ArrayList;

import com.edu.dao.MemberDAO;
import com.edu.entity.MemberEntity;
import com.edu.view.MemberView;

public class MemberController {
	MemberDAO dao = null;
	MemberView view = null;

	public MemberController() {

	}

	public void getMemberList() {
		dao = new MemberDAO();
		ArrayList<MemberEntity> list = dao.getMemberList();

		view = new MemberView();
		view.getMemberList(list);

	}

	public void getMember(String name) {
		dao = new MemberDAO();
		MemberEntity entily = dao.getMember(name);

		view = new MemberView();
		view.getMember(entily);
	}

	public void insertMember(MemberEntity ob) {
		dao = new MemberDAO();
		int n = dao.insertMember(ob);

		view = new MemberView();
		view.insertMember(n);
	}

	public void deleteMember(String name) {
		dao = new MemberDAO();
		int n = dao.deleteMember(name);

		view = new MemberView();
		view.deleteMember(n);
	}
}
