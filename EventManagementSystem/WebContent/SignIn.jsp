 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="usernotfound.jsp"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Day 001 Login Form</title>
  
  
  <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>

      <link rel="stylesheet" href="signinstyle.css">

  
</head>

<body>
<form action="./Login" method="post">
  <div class="login-wrap">
	<div class="login-html">
		<h1 >Sign in</h1>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input name="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="password" class="label">Password</label>
					<input name="password" type="password" class="input" data-type="password">
				</div>
				<div class="group">
				<div class="b">
					<input type="submit" class="button" value="Sign In">
				</div> </div>
				<div class="hr"></div>
			</div>
		</div>
	</div>
</div>
</form>
</body>
<%String msg=(String)session.getAttribute("errorMessage");
	if(session.getAttribute("errorMessage")==null){
		out.println("welcome");	
	}
	else{
		out.println(msg);
	}
 %> 
</html>
 