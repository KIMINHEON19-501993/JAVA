package com.edu.entity;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private int mid;
    private String name;    
    private int kor;
    private int eng;
    private int mat;
    private int rank = 1;
    
    public Student() {
    	
	}

	public Student(int mid, String name, int kor, int eng, int mat, int rank) {
		super();
		this.mid = mid;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.rank = rank;
	}
    
	@Override
	public String toString() {
		NumberFormat num = new DecimalFormat("0.##");
		return getTot()+"\t"+num.format(getAvg())+"\t"+getGrade()+"\t"+getResult();
	}
	
	public int getTot() {
		return getKor() + getEng() + getMat();
		
	}
    public double getAvg() {
		return getTot() / 3.0;
    	
    }
    public char getGrade() {
    	char grade = ' ';
    	switch((int)getAvg()/10) {
    		case 10:
    		case 9:
    			grade = 'A';
    			break;
    		case 8:
    			grade = 'B';
    			break;
    		case 7:
    			grade = 'C';
    			break;
    		default :
    			grade = 'F';
    			break;
    			
    	}
		return grade;
    	
    }
    public String getResult() {
    	String result = null;
    	if (getGrade() == 'F') {
    		result = "불합격";
		}else {
			result = "합격";
		}
		return result;
    	
    }

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getRank() {
		
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
    
    
}