package com.project.food.model;

public class BucketVO {
	
	private String order_Num;
	private String food_Name;
	private String order_Price;
	
	public BucketVO() {
		
	}
	
	public BucketVO(String order_Num, String food_Name, String order_Price) {
		super();
		this.order_Num = order_Num;
		this.food_Name = food_Name;
		this.order_Price = order_Price;
	}
	
	public String getOrder_Num() {
		return order_Num;
	}
	public void setOrder_Num(String order_Num) {
		this.order_Num = order_Num;
	}
	public String getFood_Name() {
		return food_Name;
	}
	public void setFood_Name(String food_Name) {
		this.food_Name = food_Name;
	}
	public String getOrder_Price() {
		return order_Price;
	}
	public void setOrder_Price(String order_Price) {
		this.order_Price = order_Price;
	}

}
