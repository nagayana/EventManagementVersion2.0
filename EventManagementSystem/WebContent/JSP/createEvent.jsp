<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="JSP/createEvent.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<form action="createEvent" method="POST">

		<div id="container">
			<div id="eventform">
				<div class="form-style-3">
					<fieldset>
						<legend>Event Information</legend>
						<label for="id"><span>ID <span	class="required">*</span></span>
							<input type="text" class="input-field"	name="id" value="" />
						</label> 
						
						<label for="name"><span>Name	<span class="required">*</span></span>
							<input type="text" class="input-field" name="name" value="" />
						</label>
						
						<label for="location"><span>Location <span class="required">*</span></span>
							<input type="text" class="input-field" name="location" value="" />
						</label> 
						
						<label for="time"><span>Time <span class="required">*</span></span>
							<input type="text" class="input-field" name="time" value="" />
						</label> 
						
						<label for="deadline"><span>Deadline <span class="required">*</span></span>
							<input type="text" class="input-field" name="deadline" value="" />
						</label> 
						
						<label for="maxRegistration"><span>Max Registration <span class="required">*</span></span>
							<input type="number" class="input-field" name="maxRegistration" value="" />
						</label> 
						
						<br>
						
						<input type="submit" value="submit">
						<input type="reset" value="reset">
						
				
					</fieldset>
					
					
					<!--  
					<fieldset>
						<legend>Guest List</legend>
						<label for="field7"><span>Designation List<span class="required">*</span></span> 
						
						<select
								name="field7" class="select-field">
									<option value="Appointment">Appointment</option>
									<option value="Interview">Interview</option>
									<option value="Regarding a post">Regarding a post</option>
						</select>
						
						</label>
					</fieldset>
					
					
					<fieldset>
						<legend>Attractions</legend>
						
						<label for="field8"><span>ID <span	class="required">*</span></span>
							<input type="text" class="input-field"	name="field8" value="" />
						</label> 
						
						<label for="field9"><span>Name	<span class="required">*</span></span>
							<input type="email" class="input-field" name="field9" value="" />
						</label>
						
						<label for="field10"><span>Coordinator<span class="required">*</span></span>
							<input type="text" class="input-field" name="field10" value="" />
						</label> 
						
						<label for="field11"><span>Duration	<span class="required">*</span></span>
							<input type="email" class="input-field" name="field11" value="" />
						</label>
						
						<label for="field12"><span>Price <span class="required">*</span></span>
							<input type="text" class="input-field" name="field12" value="" />
						</label> 
						
					</fieldset>
					
					
					
					
					
					<fieldset>
						<legend>How Many Attractions</legend>
						
						<a href="">Click here to add more attractions</a>
						
						
					</fieldset>
					
					
					
					
					-->

				</div>



			</div>
		</div>

	</form>

</body>

</html>