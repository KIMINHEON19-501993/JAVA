package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static db2.JdbcTemplate.getConnection;
import static db2.JdbcTemplate.close;
import static db2.JdbcTemplate.commit;
import static db2.JdbcTemplate.rollback;
public class EmpDao {

	public void addressList() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from addressbook";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

//			if(rs != null) {System.out.println("결과조회 성공!");}
			// while문 이용
			while (rs.next()) {
				System.out.print(rs.getInt("NUM") + "\t");// rs.getInt(1)
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getString("PHONE") + "\t");
				System.out.println(rs.getString("ADDR"));
			}
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(conn);
		}

	}//end of addressList
	
	public void addressInsert(String name, String phone, String addr) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		String sql = "insert into addressbook(num,name,phone,addr) "
				+ "values(num_seq.nextval,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			n = pstmt.executeUpdate();
			
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 추가 되었습니다.");
			}
		} catch (SQLException e) {
			System.out.println("");
			rollback(conn);
		}finally {
			close(pstmt);
			close(conn);
		}
		
	}//end of addressInsert
	
	public boolean addressSearch(String name) {
		boolean ck = false;
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		
		String sql = "select * from addressbook where name = '"+name+"'";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				ck =true;
				System.out.print(rs.getInt("NUM") + "\t");// rs.getInt(1)
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getString("PHONE") + "\t");
				System.out.println(rs.getString("ADDR"));
			}
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(conn);
		}
		
		return ck;
	}

	public void addressUpdate(String name, String phone, String addr) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0; 
		String sql = "update addressbook set phone = ?, addr = ? where name = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, phone);
				pstmt.setString(2, addr);
				pstmt.setString(3, name);
				n = pstmt.executeUpdate();
				
				if(n > 0) 
					commit(conn);
					System.out.println(n + "의 데이터가 수정 되었습니다.");
			} catch (SQLException e) {
				rollback(conn);
				System.out.println("데이터 수정에 실패 했습니다.");
			}finally {
				close(pstmt);
				close(conn);
			}
		
	}//end of addressUpdate

	public void addressDelete(String name) {
		Connection conn =getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		String sql ="delete from addressbook where name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			n = pstmt.executeUpdate();
			
			if (n > 0) {
				commit(conn);
				System.out.println(n+ "건의 데이터가 삭제 되었습니다");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("삭제에 실패 했습니다.");
		}finally {
			close(pstmt);
			close(conn);
		}
		
	}

}//end of class
