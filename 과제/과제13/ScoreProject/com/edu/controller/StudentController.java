package com.edu.controller;

import java.util.ArrayList;

import com.edu.dao.StudentDAO;
import com.edu.entity.Student;
import com.edu.view.StudentView;

public class StudentController {
	StudentDAO dao = null;
	StudentView view = null;

	public StudentController() {
		dao = new StudentDAO();
		view = new StudentView();
	}

	public void getStudentList() {
		dao = new StudentDAO();
		ArrayList<Student> list = dao.getStudentList();

		view = new StudentView();
		view.getStudentList(list);
	}

	public void getStudent(String name) {
		dao = new StudentDAO();
		Student list = dao.getStudent(name);

		view = new StudentView();
		view.getStudent(list);
	}

	public String insertStudent(Student entity) {
		dao = new StudentDAO();
		int n = 0;
		String str = null;
		if (entity.getKor() <= 100 && entity.getKor() >=0 && entity.getEng() <= 100 
				&& entity.getEng() >=0 && entity.getMat() <= 100 && entity.getMat() >=0) 
		{
			n = dao.insertStudent(entity);
			str = "";
			view = new StudentView();
			view.insertStudent(n, entity.getName());
		}
		return str;
	}

	public void deleteStudent(String name) {
		dao = new StudentDAO();
		int n = dao.deleteStudent(name);

		view = new StudentView();
		view.deleteStudent(n, name);
	}
}
