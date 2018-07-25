<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="event" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Event Details</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="header" class="container">
			<div id="logo">
				<h2>Event Management System</h2>
			</div>
			<div id="menu" >
				<ul>
					<li class="active"><a href="">Log Out</a></li>
				</ul>
			</div>
        </div>
        <!-- end of  header --> 
        
        <div style="margin:300px" onClick="./ShowEvent">
	     <event:forEach  var="event" items="${eventList}">
	    <input type="radio" name="eventId" value="${event.eventID }" >
	     ${event.eventID }${event.eventName } <br>
	     </event:forEach>
        </div>
	
	
	
	<div id="footer">
	<p>&copy;  have a nice day.</p>
</div>
<!-- end of footer -->
</body>
</html>