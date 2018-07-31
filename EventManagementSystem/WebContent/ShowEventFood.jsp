<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="AddFood.css">
<title>Event Food</title>
</head>
<body>

		<div class="navbar">
			<a href="./AddFood" id="firstLink">Add Food</a> 
			<a href="#news">Update Food	Quantity</a> 
			<a href="">Delete Food</a>
		</div>
i       <div id="container"> 

		<div id="headerText"i id="text">These are the foods you have added to this event</div>
	
			<table id="myTable" border="1" cellpadding="15">
				<tr>
					<td><b>Name</b></td>
					<td><b>Quantity</b></td>
					<td><b>Total Price</b></td>
				</tr>
				<c:forEach items="${eventFoodList}" var="food">
					<tr>
						<td>${food.foodName}</td>
						<td>${food.foodQuantity}</td>
						<td>${food.foodPrice}</td>
					</tr>

				</c:forEach>
			</table>

			<br>
			<div id="submitButton">
				<input type="submit" value="submit">
			</div>
		
	</div>

</body>
</html>