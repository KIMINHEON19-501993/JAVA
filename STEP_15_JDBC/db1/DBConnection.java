package db1;
//statement : 매번 컴파일
//PreparedStatement : 한번 컴파일후 사용, 입력받아서 처리하는 경우
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	Connection conn = null;

	public DBConnection() {

		try {
			// 1.드라이브 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.연결객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
//			System.out.println("연결성공");
		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("연결실패");
			e.printStackTrace();

		}
	}
	public void addressList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 4.결과값 반환
		// 3.sql 문장 실행
		String sql = "SELECT * FROM ADDRESSBOOK ORDER BY NUM DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //executeQuery() : select 문장에만 사용
//			if(rs != null) {
//				System.out.println("데이터 가져오기 성공");
//			}
			while (rs.next()) {
				System.out.print(rs.getInt("NUM") + "\t");// rs.getInt(1)
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getString("PHONE") + "\t");
				System.out.println(rs.getString("ADDR"));
			}
		} catch (SQLException e) {
//			System.out.println("데이터 가져오기 실패");
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}//end of addressList
 //PreparedStatement 객체 사용
	public void addressInsert(String name, String phone, String addr) {
		PreparedStatement pstmt = null;
		int n = 0;
		
		String sql = "insert into addressbook(num,name,phone,addr)"
				+ " values(num_seq.nextval,?,?,?)";
//		System.out.println(sql);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			n = pstmt.executeUpdate();
			
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 추가 되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO 자동 생성된 catch 블록
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}//end ofaddressInsert

/*
	//Statement객체사용
	public void addressInsert(String name, String phone, String addr) {
		int n = 0;
		Statement stmt = null;
		String sql = "insert into addressbook(num,name,phone,addr) "
				+ "values(num_seq.nextval,'"+name+"','"+phone+"','"+addr+"')";

		//		System.out.println(sql);
		
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			
			if (n>0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 추가 되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO 자동 생성된 catch 블록
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		}
	}
*/

	//PreparedStatement 사용
	public void addressUpdate(int num, String phone, String addr) {
		PreparedStatement pstmt = null;
		int n = 0;
		
		String sql = "update addressbook set phone = ?, addr = ? where num = ?";
//		System.out.println(sql);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			n = pstmt.executeUpdate();
			
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 수정 되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO 자동 생성된 catch 블록
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		}
	}//end of addressUpdate

	//Statement객체사용
/*	public void addressUpdate(int num, String phone, String addr) {
		int n = 0;
		Statement stmt = null;
		String sql = "update addressbook set "
				+ "phone = '"+phone+"', addr = '"+addr+"' where num = '"+num+"'";

		//		System.out.println(sql);
		
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			
			if (n>0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 수정 되었습니다.");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO 자동 생성된 catch 블록
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		}
	}
	
	public void addressDelete(int num) {
		String sql = "delete from addressbook where num = '"+num+"'";
		Statement stmt = null;
		int n = 0;
		try {
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
			
			if (n > 0) {
				System.out.println(n + "개의 데이터가 삭제 되었습니다.");
			}else if (n==0) {
				System.out.println("삭제할 데이터가 존재하지 않습니다.");	
			}
		} catch (SQLException e) {
			try {
				System.out.println("데이터가 삭제에 실패 했습니다.");
				conn.rollback();
			} catch (SQLException e1) {
				// TODO 자동 생성된 catch 블록
				e1.printStackTrace();
			}
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		}
	}
*/


	//PreparedStatement 사용
	public void addressDelete(int num) {
		PreparedStatement pstmt = null;
		int n = 0 ;
		String sql = "delete from addressbook where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			n = pstmt.executeUpdate();
			
			if (n > 0) {
				System.out.println(n + "개의 데이터가 정상적으로 삭제 되었습니다");
			}else if (n==0) {
				System.out.println("삭제할 데이터가 존재하지 않습니다.");	
			}
			
		} catch (SQLException e) {
		
			try {
				System.out.println("데이터가 삭제에 실패 했습니다.");
				conn.rollback();
			} catch (SQLException e1) {
				// TODO 자동 생성된 catch 블록
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		}
	}
	
}//end of class
