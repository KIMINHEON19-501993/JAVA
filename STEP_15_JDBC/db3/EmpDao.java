package db3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static db3.JdbcTemplate.*;
public class EmpDao {
	
	public List<EmpEntity> addressList() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		EmpEntity entity = null;
		List<EmpEntity> list = null;
		
		String sql = "select * from addressbook order by num";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);//그림의 3,4
			
			list = new ArrayList<EmpEntity>();
			if (rs != null) {
//				System.out.println("데이터 가져오기 성공");
			}
			while (rs.next()) {
				//엔티티에 저장 ---> 리스트에 담아 저장
				entity = new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
				
				list.add(entity);	
			}
			
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		return list;
	}//end of addressList
	
	public int addressInsert(EmpEntity entity) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		String sql = "insert into addressbook(num,name,phone,addr) "
				+ "values(num_seq.nextval,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setString(2, entity.getPhone());
			pstmt.setString(3, entity.getAddr());
			n = pstmt.executeUpdate();
			
			if (n>0) {
				commit(conn);
			}
		} catch (SQLException e) {
			rollback(conn);
		}
		return n;
	}//end of addressInsert

	public EmpEntity addressSearch(String name) {
		Connection conn = getConnection();
		Statement stmt= null;
		ResultSet rs = null;
		EmpEntity entity = null;
		String sql = "select * from addressbook where name ='"+name+"'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				commit(conn);
				entity =new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
				
			}
		} catch (SQLException e) {
			rollback(conn);
		}finally {
			close(conn);
			close(rs);
			close(stmt);
		}
		
		return entity;
	}//end of addressSearch

	public int addressUpdate(String name, String phone, String addr) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int  n = 0;
		
		String sql = "update addressbook set phone = ?, addr = ? where name= ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setString(3, name);
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
	}//end of addressUpdate
	
	public int addressDelete(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int  n = 0;
		
		String sql = "delete from addressbook where name= ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
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
	}//end of addressUpdate
}
