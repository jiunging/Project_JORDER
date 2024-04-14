<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디저트</title>
<link rel="stylesheet" href="../css_food/food.css?after">
</head>
<body>
	<div class="wrapper">
		<div class="wrapper__body" style="flex-wrap: wrap;">
        	<c:forEach var="i" items="${list }"> 
	        	<div class="food_list">
	        		<div style="cursor: pointer;">
	        			<a href="insertForm6.food?name=${i.foodname }&price=${i.foodprice}&type=${i.foodcategory}">
		        			<img src="../image/${i.foodimgpath}" class="food__img">
		        		</a>
		       			<div class="food__name?name=${i.foodname }">${i.foodname }</div>
		        		<div class="food__cost">${i.foodprice }</div>
	        		</div>
	        	</div>
        	</c:forEach>
        </div>
	</div>
</body>
</html>