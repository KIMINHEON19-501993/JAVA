package db4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import static db4.JdbcTemplate.*;

public class UserDao {
	public List<UserEntity> userList() {
		
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		UserEntity entity = null;
		
		List<UserEntity> list = new ArrayList<UserEntity>();
		
		String sql = "select * from userinfo order by num";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				entity = new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getInt("score"));
				list.add(entity);
				
			}
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			close(conn);
			close(stmt);
			close(rs);
		}
		
		
		
		return list;
	}

	public UserEntity selectUser(String id) {
		
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		UserEntity entity = null;
		String sql = "select * from userinfo where id = '"+id+"'";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				commit(conn);
				entity = new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getInt("score"));
			}
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
		
		return entity;
	}

	/*
	public int insertUser(UserEntity entity) {
		int n = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into userinfo(num,id,passwd,name,score) "
				+ "values(stu_seq.nextval,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, entity.getId());
			pstmt.setString(2, entity.getPasswd());
			pstmt.setString(3, entity.getName());
			pstmt.setDouble(4, entity.getScore());
			n = pstmt.executeUpdate();
			
			if (n > 0) {
				commit(conn);
			}
			
		} catch (SQLException e) {
			rollback(conn);
		}finally {
			close(conn);
			close(pstmt);
		}

		return n;
	}//end of insertUser
	*/
	
	
	public int insertUser(UserEntity entity) {
		
		Connection conn = getConnection();
		Statement stmt = null;
		int n = 0;
	
		
		String sql = "insert into userinfo(num,id,passwd,name,score) "
				+ "values(stu_seq.nextval,'"+entity.getId()+"','"+entity.getPasswd()+"',"
						+ "'"+entity.getName()+"','"+entity.getScore()+"')";
		
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			
			if (n>0) {
				commit(conn);
			}
			
		} catch (SQLException e) {
			rollback(conn);
		}finally {
			close(conn);
			close(stmt);
		}
		return n;
		
	}//end of insertUser
	
	
}
