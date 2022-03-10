package com.edu.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.edu.entity.Student;

public class StudentView {
	public void insertStudent(int n, String name) {
		if (n > 0) {
			System.out.println(name + "을(를) 추가했습니다.");
		} else
			System.out.println("데이터가 추가에 실패했습니다.");
	}// end of insertStudent

	public void deleteStudent(int n, String name) {
		if (n > 0) {
			System.out.println(name + "가(이) 삭제되었습니다");
		} else
			System.out.println("데이터 삭제에 실패했습니다.");
	}// end of deleteStudent

	public void getStudentList(ArrayList<Student> list) {
		
		for (int i = 0; i < list.size(); i++) {
		  	for (int j = 0; j < list.size(); j++) {
		    		if (list.get(i).getAvg() < list.get(j).getAvg()) {
		      			int rank = list.get(i).getRank();
	        			rank += 1;
	        			list.get(i).setRank(rank);
	      			}
	    		}
	  	}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t결과\t순위");
		System.out.println("-------------------------------------------------------------------------------");
		for (Student entity : list) {
			System.out.print(entity.getMid() + "\t");
			System.out.print(entity.getName() + "\t");
			System.out.print(entity.getKor() + "\t");
			System.out.print(entity.getEng() + "\t");
			System.out.print(entity.getMat() + "\t");
			System.out.print(entity.toString()+"\t");
			System.out.print(entity.getRank() + "\n");

		}
		
	}// end of getStudentList

	public void getStudent(Student entity) {
		List<Student> list = new ArrayList<Student>();
		
				for (int i = 0; i < list.size(); i++) {
		  	for (int j = 0; j < list.size(); j++) {
		    		if (list.get(i).getAvg() < list.get(j).getAvg()) {
		      			int rank = list.get(i).getRank();
	        			rank += 1;
	        			list.get(i).setRank(rank);
	      			}
	    		}
	  	}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t결과\t순위");
		System.out.println("-------------------------------------------------------------------------------");
		if (entity != null) {
			
			System.out.print(entity.getMid() + "\t");
			System.out.print(entity.getName() + "\t");
			System.out.print(entity.getKor() + "\t");
			System.out.print(entity.getEng() + "\t");
			System.out.print(entity.getMat() + "\t");
			System.out.print(entity.toString()+"\t");
			System.out.print(entity.getRank() + "\n");
		} else
			System.out.println("찾는 사람이 없습니다");
	}// end of getStudent
}
