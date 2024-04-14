package com.project.food.model;

public class FoodVO {

	private String foodnum;
	private String foodname;
	private String foodprice;
	private String foodcategory;
	private String foodimgpath;
	
	public FoodVO() {
		
	}

	public FoodVO(String foodnum, String foodname, String foodprice, String foodcategory, String foodimgpath) {
		super();
		this.foodnum = foodnum;
		this.foodname = foodname;
		this.foodprice = foodprice;
		this.foodcategory = foodcategory;
		this.foodimgpath = foodimgpath;
	}
	
	

	@Override
	public String toString() {
		return "[" + foodnum + "-" + foodname + "-" + foodprice + "-" + foodcategory + "-" +foodimgpath + "]";
	}

	public String getFoodnum() {
		return foodnum;
	}

	public void setFoodnum(String foodnum) {
		this.foodnum = foodnum;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getFoodprice() {
		return foodprice;
	}

	public void setFoodprice(String foodprice) {
		this.foodprice = foodprice;
	}

	public String getFoodcategory() {
		return foodcategory;
	}

	public void setFoodcategory(String foodcategory) {
		this.foodcategory = foodcategory;
	}

	public String getFoodimgpath() {
		return foodimgpath;
	}

	public void setFoodimgpath(String foodimgpath) {
		this.foodimgpath = foodimgpath;
	}
	
	
	
}
