package com.project.food.serivce;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.food.model.BucketVO;
import com.project.food.model.FoodDAO;
import com.project.food.model.FoodVO;

public class FoodServiceImpl implements FoodService{

	private FoodDAO dao = FoodDAO.getInstance();
	
	// type 별 Database 값 가져오기
	@Override
	public ArrayList<FoodVO> getList(HttpServletRequest request, HttpServletResponse response) {
		
		String category = request.getParameter("type");
		request.setAttribute("category", category);
		
		ArrayList<FoodVO> list = dao.getList(category);
		return list;
	}

	
	@Override
	public void inSert(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		System.out.println("implement : " + name + " " + price);
		
		dao.inSert(name, price);
			
	}


	@Override
	public ArrayList<BucketVO> foodList(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<BucketVO> list = dao.foodList();	
		return list;
	}


	@Override
	public void order(HttpServletRequest request, HttpServletResponse response) {
		
		dao.order();
		System.out.println("delete_imple 이 실행되었습니다.");
		
	}




}
