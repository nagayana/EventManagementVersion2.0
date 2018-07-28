<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="event" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Event Details</title>
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
<%//ServletContext servletcontext=request.getServletContext(); %>
<%//String flag=(String)servletcontext.getAttribute("flag"); %>
<%//int flag1=Integer.parseInt(flag); %>
<%//pageContext.setAttribute("flag1", flag1); %>
<div id="header" class="container">
			<div id="logo">
				<h2>Event Management System</h2>
			</div>
			<div id="menu" >
				<ul>
					<li class="active"><a href="Login.jsp">Log Out</a></li>
				</ul>
			</div>
        </div>
        <!-- end of  header --> 
        
        <div align="center"> 
        <table>
         <tr>
	            <td> EventID </td>
	            <td> EventName </td>
	            <td> EventLocation</td>
	            <td> EventRegistrationDeadline</td>
	            <td> EventTime </td>
	            <td> MaxRegistration</td>
	            <td> CurrentRegistration</td>
	            
	        </tr>
	        
	     <event:forEach  var="event" items="${eventList}">
	   
	        <tr>
	            <td> ${event.eventID }</td>
	            <td> ${event.eventName }</td>
	            <td> ${event.eventLocation }</td>
	            <td> ${event.eventRegistrationDeadline }</td>
	            <td> ${event.eventTime }</td>
	            <td> ${event.maxRegistration }</td>
	            <td> ${event.currentRegistration }</td>
	            
	        </tr>
	    
	     </event:forEach>
	    </table>
	    <br>
	    <br>
	    <event:if test="${flag eq 1 }">
	     <form action="./ShowEvent" method="post">
	         Input an Event ID to show its more details
             <input type="text" name="id">
             <input type="submit" name="submit">
         </form>
	     </event:if>
	     
	     <event:if test="${flag eq 2 }">
	     <form action="./FinalDelete" method="post">
	         Input an Event ID which you want to delete
             <input type="text" name="id">
             <input type="submit" name="submit">
         </form>
	     </event:if>
        </div>
	
	
	
	<div id="footer">
	<p>&copy;  have a nice day.</p>
</div>
<!-- end of footer -->
</body>
</html>