<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="event" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Events for registration</title>
<link href="style2.css" rel="stylesheet" type="text/css" media="screen" />
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
<div id="header" class="container">
			<div id="logo">
				<h1>Event Management System</h1>
			</div>
			<div id="menu" >
				<ul>
					<li class="active"><a href="">Log Out</a></li>
				</ul>
			</div>
        </div>
        <!-- end of  header --> 
      <%--- <%= ((ArrayList<Event>)session.getAttribute("unRegisterdEvents")) %> --%> 
      <div align="center"> 
        <table>
         <tr>
	            <td> EventID </td>
	            <td> EventName </td>
	            <td> EventLocation</td>
	            <td> EventTime </td>
	            
	            
	        </tr>
	     <event:forEach  var="event" items="${unRegisterdEvents}">
	   
	        <tr>
	            <td> ${event.eventID }</td>
	            <td> ${event.eventName }</td>
	            <td> ${event.eventLocation }</td>
	            <td> ${event.eventTime }</td>
	           
	        </tr>
	    
	     </event:forEach>
	    </table>
	    <br>
	    <br>
	     <form action="./Registrationadded" method="post">
	         Input an Event ID to register
             <input type="text" name="id">
             <input type="submit" name="submit">
         </form>
	     
        </div>
	
	
	
	<div id="footer">
	<p>&copy;  have a nice day.</p>
</div>
<!-- end of footer -->
</body>
</html>