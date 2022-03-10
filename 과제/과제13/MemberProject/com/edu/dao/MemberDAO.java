package com.edu.dao;

import static common.MyConnectionPool.close;
import static common.MyConnectionPool.commit;
import static common.MyConnectionPool.getConnection;
import static common.MyConnectionPool.rollback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.edu.entity.MemberEntity;

public class MemberDAO {
	public ArrayList<MemberEntity> getMemberList() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<MemberEntity> list = null;
		MemberEntity entity = null;
		String sql = "select * from member order by idx";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			list = new ArrayList<MemberEntity>();
			while (rs.next()) {
				entity = new MemberEntity();
				entity.setIdx(rs.getInt("idx"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				list.add(entity);
			}

		} catch (Exception e) {
			System.out.println("e.getMessage() = "+e.getMessage());
			rollback(conn);
		}finally{
			close(conn);
			close(rs);
			close(stmt);
		}

		return list;

	}

	public MemberEntity getMember(String name) {
		Connection conn = getConnection();
		Statement stmt= null;
		ResultSet rs = null;
		MemberEntity entity = null;
		String sql = "select * from member where name ='"+name+"'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				commit(conn);
				entity =new MemberEntity();
				entity.setIdx(rs.getInt("idx"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
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

	public int insertMember(MemberEntity ob) {
		
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int n = 0;
		String sql = "insert into member(idx,name,phone) "
				+ "values(mp_idx.nextval,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ob.getName());
			pstmt.setString(2, ob.getPhone());
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

	public int deleteMember(String name) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int  n = 0;
		
		String sql = "delete from member where name= ?";
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
