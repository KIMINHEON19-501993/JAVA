package db5;

import static db5.JdbcTemplate.close;
import static db5.JdbcTemplate.commit;
import static db5.JdbcTemplate.getConnection;
import static db5.JdbcTemplate.rollback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.StatementEvent;

public class StudentDao {
	public String insertStudent(StudentEntity entity) {
		String name = null;
		int n = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into student(num,name,kor,eng,mat) " + "values(n_sql.nextval,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setInt(2, entity.getKor());
			pstmt.setInt(3, entity.getEng());
			pstmt.setInt(4, entity.getMat());
			n = pstmt.executeUpdate();

			if (n > 0) {
				commit(conn);
				name = entity.getName();
			}
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(conn);
			close(pstmt);
		}
		return name;
	}//end of insertStudent
	/*
	public String insertStudent(StudentEntity entity) {

		int n = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into student(num,name,kor,eng,mat) " + "values(n_sql.nextval,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setInt(2, entity.getKor());
			pstmt.setInt(3, entity.getEng());
			pstmt.setInt(4, entity.getMat());
			n = pstmt.executeUpdate();

			if (n > 0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(conn);
			close(pstmt);
		}
		return entity.getName();
	}//end of insertStudent
	 */
	public StudentEntity getStudent(String name) {
		StudentEntity entity = null;
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from student where name = '" + name + "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				commit(conn);
				entity = new StudentEntity();
				entity.setName(rs.getString("name"));
				entity.setKor(rs.getInt("kor"));
				entity.setEng(rs.getInt("eng"));
				entity.setMat(rs.getInt("mat"));
				entity.setTot(rs.getInt("kor")+rs.getInt("eng")+rs.getInt("mat"));
				entity.setAvg((rs.getInt("kor")+rs.getInt("eng")+rs.getInt("mat"))/3.0);
			}
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(conn);
			close(stmt);
			close(rs);
		}
		return entity;

	}//end of getStudent

	public List<StudentEntity> getStudentList() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		StudentEntity entity = null;
		List<StudentEntity> list = null;
		
		String sql = "select * from student order by num";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<StudentEntity>();
			if (rs!=null) {
				commit(conn);
			}
			while (rs.next()) {
				entity = new StudentEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setKor(rs.getInt("kor"));
				entity.setEng(rs.getInt("eng"));
				entity.setMat(rs.getInt("mat"));
				entity.setTot(rs.getInt("kor")+rs.getInt("eng")+rs.getInt("mat"));
				entity.setAvg(entity.getTot()/3.0);
				list.add(entity);
			}
		} catch (SQLException e) {
			rollback(conn);
		} finally {
			close(conn);
			close(stmt);
			close(rs);
		}

		return list;

	}//end of getStudentList
}//end of class
