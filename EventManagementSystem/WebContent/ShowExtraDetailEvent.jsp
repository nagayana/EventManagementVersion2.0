<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="event" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<style>
table, th, td {
    border: 1px solid white;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;    
}
</style>
</head>
<body>
<br>
<br>
 <h3 align="center">Here are the attraction list for the event </h3><br>
 <br>
	<div align="center"> 
        <table>
         <tr>
	            <td> ID </td>
	            <td> Name </td>
	            <td> Coordinator</td>
	            <td> Duration</td>
	            <td> Price</td>
	
	            
	        </tr>
	        
	     <event:forEach  var="attraction" items="${attraction}">
	   
	        <tr>
	            <td> ${attraction. attractionId }</td>
	            <td> ${attraction.name }</td>
	            <td> ${attraction.coordinatorName }</td>
	            <td> ${attraction.duration }</td>
	            <td> ${attraction.price }</td>
	            
	            
	        </tr>
	    
	     </event:forEach>
	    </table>
	    <br>
	    <br>
	    
	    <h3 align="center">Here are the Food list for the event </h3><br>
 <br>
	<div align="center"> 
        <table>
         <tr>
	            <td> ID </td>
	            <td> Name </td>
	           
	          
	   
	
	            
	        </tr>
	        
	     <event:forEach  var="food" items="${food}">
	   
	        <tr>
	            <td> ${food.foodId }</td>
	            <td> ${food.foodName }</td>
	           
	            
	       
	            
	            
	        </tr>
	    
	     </event:forEach>
	    </table>
	    <br>
	    <br>
	</div>
	
	<div id="footer">
	<p>&copy;  have a nice day.</p>
</div>
<!-- end of footer -->
</body>
</html>