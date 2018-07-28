<%@page import="com.project.service.DesignationServiceImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% //ArrayList<Designation> designationList = new DesignationServiceImp().get  %>

	<table>
		<tr>
			<td>Designation ID</td>
			<td>Designation Name</td>
		</tr>
		<c:forEach items="${designationList}" var="designation">
		<tr>	
			<td><input type="checkbox" name="idList" value="${designation.designationId}"></td>
			<td>${designation.designationId}</td>
			<td>${designation.designationName}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>