<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
<link rel="stylesheet" type="text/css" href="createEvent.css">
<title>Insert title here</title>
</head>
<body>

	<form action="./UpdateEventDetails" method="post">

		  <div id="container">
			<div id="eventform">
				<div class="form-style-3">
					<fieldset>
						<legend>Input in the Field Which you to Update for The Event</legend>
						
						
						<label for="name"><span>Name	<span >*</span></span>
							<input type="text" class="input-field" name="name" value="${event.eventName }" />
						</label>
						
						<label for="location"><span>Location <span >*</span></span>
							<input type="text" class="input-field" name="location" value="${event.eventLocation }" />
						</label> 
						
						<label for="time"><span>Time <span >*</span></span>
							<input type="text" class="input-field" name="time" value="${event.eventTime }" />
						</label> 
						
						<label for="deadline"><span>Deadline <span >*</span></span>
							<input type="text" class="input-field" name="deadline" value="${event.eventRegistrationDeadline }" />
						</label> 
						
						
						
						<br>
						
						<input type="submit" value="submit">
						<input type="reset" value="reset">
						
				
					</fieldset>
					
				</div>
			</div>
		</div>	
		
  <br>
  
  
  
  </div>
  

<!-- end of footer -->
</body>
</html>