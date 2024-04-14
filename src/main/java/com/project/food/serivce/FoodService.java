package com.project.food.serivce;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.food.model.BucketVO;
import com.project.food.model.FoodVO;

public interface FoodService {
	
	public void inSert(HttpServletRequest request, HttpServletResponse response);
	public ArrayList<FoodVO> getList(HttpServletRequest request, HttpServletResponse response);
	public ArrayList<BucketVO> foodList(HttpServletRequest request, HttpServletResponse response);
	public void order (HttpServletRequest request, HttpServletResponse response);
	
}
