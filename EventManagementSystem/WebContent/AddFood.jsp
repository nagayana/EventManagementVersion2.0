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
		<div id="container">
		
		<div id="headerText">Select foods from the list</div>
			<form action="./FoodQuantity" method="post">
				<table id="myTable" border="1" cellpadding="15">
					<tr>
						<td><b>Select</b></td>
						<td><b>ID</b></td>
						<td><b>Name</b></td>
						<td><b>Price</b></td>
					</tr>
					<c:forEach items="${foodList}" var="food">
						<tr>
							<td><input type="checkbox" name="foods" value="${food.foodId}"></td>
							<td>${food.foodId }</td>
							<td>${food.foodName}</td>
							<td>${food.price}</td>
						</tr>

					</c:forEach>
				</table>
				
				<br>
				<div id="submitButton">
					<input type="submit" value="submit">
				</div>
			</form>
		</div>
</body>
</html>