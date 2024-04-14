package com.project.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import com.project.util.JdbcUtil;

public class UserDAO {
	// 1. 객체 1개 생성
	private static UserDAO instance = new UserDAO();
	// 2. 생성자 1개 생성
	private DataSource dataSource;
	
	private UserDAO() {
		try {
			// 1. 드라이버 호출
			InitialContext init = new InitialContext();
			dataSource = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("드라이버 호출이 실패하였습니다.");
		}
	}
	
	// 3. getter 메서드
	public static UserDAO getInstance() {
		return instance;
	}
		
	// user_join.jsp
	// 회원 가입 아이디 중복 여부
	public int idCheck(String id) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MEMBERS WHERE ID = ?";
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next() == true) {
				result = 1;
			}else {
				result = 0;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("아이디 중복여부 확인 중 예기치 못한 에러가 발생하였습니다.");
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
		
	}
	
	// 회원가입
	public void insertUser(UserVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO MEMBERS(ID,PW,NAME,EMAIL)"
				+ "VALUES(?,?,?,?) ";
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("회원가입 데이터 저장 도중 예기치못한 오류가 발생하였습니다.");
		}finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		
	}
	
	// 로그인
	public UserVO login(String id, String pw) {
	
		UserVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String sql = "SELECT * FROM MEMBERS WHERE ID =? AND PW=?";
		
		try {
			
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new UserVO();
				vo.setId(id);
				vo.setName(rs.getString("name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("로그인 시도 중 예기치못한 장애가 발생하였습니다.");
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	public UserVO getUserInfo(String id) {
		UserVO vo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String sql = "SELECT * FROM MEMBERS WHERE ID= ?";
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
			
				vo = new UserVO(id, null, name, email);
				System.out.println("회원정보처리과정에서 vo로 데이터가 정상입력되었습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("회원정보 처리과정에서 예기치못한 오류가 발생하였습니다.");
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	public int update(UserVO vo) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEMBERS SET PW=?, NAME=?, EMAIL=? WHERE ID = ?";
			
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPw());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getId());
			
			result = pstmt.executeUpdate();
			
			System.out.println("업데이트 성공 여부 : " + result);
			System.out.println("회원정보 수정에 대한 데이터가 정상 입력되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("회원정보 수정 중 예기치못한 오류가 발생하였습니다.");
		}finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		
		return result;
	}
	
	public void delete(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEMBERS WHERE ID=?";
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("회원 삭제메소드 실행 중 예기치못한 오류발생하였습니다.");
		}finally {
			JdbcUtil.close(conn, pstmt, null);
		}
	}
}

