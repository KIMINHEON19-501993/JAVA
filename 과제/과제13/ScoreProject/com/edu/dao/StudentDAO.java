package com.edu.dao;

import static common.JdbcTemplate.close;
import static common.JdbcTemplate.commit;
import static common.JdbcTemplate.getConnection;
import static common.JdbcTemplate.rollback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.edu.entity.Student;

public class StudentDAO {
	public ArrayList<Student> getStudentList() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		Student entity = null;
		ArrayList<Student> list = null;
		String sql = "select * from student order by mid";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			list = new ArrayList<Student>();
			while (rs.next()) {
				entity = new Student();
				entity.setMid(rs.getInt("mid"));
				entity.setName(rs.getString("name"));
				entity.setKor(rs.getInt("kor"));
				entity.setEng(rs.getInt("eng"));
				entity.setMat(rs.getInt("mat"));
				list.add(entity);
			}
			
		} catch (Exception e) {
			rollback(conn);
			System.out.println("e.getMessage() = "+e.getMessage());
		}
		return list;

	}

	public Student getStudent(String name) {
		Connection conn = getConnection();
		Statement stmt= null;
		ResultSet rs = null;
		Student entity = null;
		String sql = "select * from student where name ='"+name+"'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				commit(conn);
				entity = new Student();
				entity.setMid(rs.getInt("mid"));
				entity.setName(rs.getString("name"));
				entity.setKor(rs.getInt("kor"));
				entity.setEng(rs.getInt("eng"));
				entity.setMat(rs.getInt("mat"));
			}
		} catch (SQLException e) {
			System.out.println("e.getMessage() = "+e.getMessage());
			rollback(conn);
		}finally {
			close(conn);
			close(rs);
			close(stmt);
		}
		
		return entity;

	}

	public int insertStudent(Student entity) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		String sql = "insert into student(mid,name,kor,eng,mat) "
				+ "values(m_mid.nextval,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setInt(2, entity.getKor());
			pstmt.setInt(3, entity.getEng());
			pstmt.setInt(4, entity.getMat());
			n = pstmt.executeUpdate();
			
			if (n>0) {
				commit(conn);
			}
		} catch (Exception e) {
			System.out.println("e.getMessage() = "+e.getMessage());
			rollback(conn);
		}
		return n;
	}

	public int deleteStudent(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int  n = 0;
		
		String sql = "delete from student where name= ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			n = pstmt.executeUpdate();
			
			if (n > 0) {
				commit(conn);
			}
			
		} catch (Exception e) {
			System.out.println("e.getMessage() = "+e.getMessage());
			rollback(conn);
		}finally {
			close(conn);
			close(pstmt);
		}
		
		return n;
	}
}
