package com.project.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.user.model.UserDAO;
import com.project.user.model.UserVO;

public class UserServiceImpl implements UserService{
	
	private UserDAO dao = UserDAO.getInstance();

	// 회원가입 아이디 중복 체크 여부 확인
	@Override
	public int join(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		System.out.println("ServiceImple id 정상입력여부" + id);
		
		int result = dao.idCheck(id);
		
		if(result == 1) {
			return result;
		}else {
			UserVO vo = new UserVO(id,pw,name,email);
			dao.insertUser(vo);
			return 0;
		}
		
	}
	// 로그인
	@Override
	public UserVO login(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		UserVO vo = dao.login(id, pw);
		return vo;
	}
	
	// 회원정보
	@Override
	public UserVO getUserInfo(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("user_id");
		
		UserVO vo = dao.getUserInfo(id);
	 	
		return vo;
	}
	
	// 회원정보수정
	@Override
	public int update(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		UserVO vo = new UserVO(id, pw, name, email);
		
		int result = dao.update(vo);
		
		if(result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("user_name", name);
		}
		return result;	
	}
	@Override
	public int delete(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session =  request.getSession();
		String id = (String)session.getAttribute("user_id");
		String pw = request.getParameter("pw");
		UserVO vo = dao.login(id, pw);
		// 비밀번호 삭제 성공 ( login메소드 정보와 일치할 때 )
		if(vo != null) {
			dao.delete(id);
			return 1;
		// 실패
		}else {
			return 0;
		}
	}
}
