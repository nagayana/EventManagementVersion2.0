<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="AddFood.css">
	<title>Food Quantity</title>
</head>
<body>

		<div class="navbar">
			<a href="./AddFood" id="firstLink">Add Food</a> 
			<a href="#news">Update Food	Quantity</a> 
			<a href="">Delete Food</a>
		</div>
i       
		<div id="container">
		<div id="headerText" id="text">Specify the quantity for selected foods</div>
			<form action="./UpdateFoodList" method="post">
				<table id="myTable" border="1" cellpadding="15">
					<tr>
						<td><b>Name</b></td>
						<td><b>Price</b></td>
						<td><b>Quantity</b></td>
					</tr>
					<c:forEach items="${selectedFood}" var="food">
						<tr>
							<td>${food.foodName}</td>
							<td>${food.price}</td>
							<td><input type="number" name="${food.foodId }"></td>
						</tr>

					</c:forEach>
				</table>
				
				<br>
				<input type="submit" value="submit">
			</form>
		</div>
</body>
</html>