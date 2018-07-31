<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="AddFood.css">
<title>Delete Guest</title>
</head>
<body>
	<div id="container">
		
		<div id="headerText">Select Designations to remove<br>
							Event id : ${sessionScope.eventId }</div>
		
			<form action='<c:url value="./DeleteGuestList"/>' method="post">
				<table id="myTable" border="1" cellpadding="15">
					<tr>
						<td><b>Select</b></td>
						<td><b>ID</b></td>
						<td><b>Name</b></td>
					</tr>
					<c:forEach items="${designations}" var="designation">
						<tr>
							<td><input type="checkbox" name="selectedIds" value="${designation.designationId}"></td>
							<td>${designation.designationId }</td>
							<td>${designation.designationName}</td>
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