<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="AddFood.css">
<title>Food List</title>
</head>
<body>
		

		<div class="navbar">
			<a href="./AddFood" id="firstLink">Add Food</a> 
			<a href="#news">Update Food	Quantity</a> 
			<a href="">Delete Food</a>
		</div>
i       <div id="container"> 
		<div id="headerText" class="text">Select foods from the list</div>
			<form action="./FoodQuantity" method="post">
				<table id="myTable" border="1" cellpadding="15">
					<tr>
						<td><b>Select</b></td>
						<td><b>ID</b></td>
						<td><b>Name</b></td>
						<td><b>Price</b></td>
					</tr>
					<c:forEach items="${validFoodList}" var="food">
						<tr>
							<td><input type="checkbox" name="foods" value="${food.foodId}"></td>
							<td>${food.foodId }</td>
							<td>${food.foodName}</td>
							<td>${food.price}</td>
						</tr>

					</c:forEach>
				</table>
				
				<br>
				<div id="submitButton" class="text">
					<input type="submit" value="submit">
				</div>
			</form>
		</div>
</body>
</html>