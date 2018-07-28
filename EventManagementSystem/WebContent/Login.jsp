<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="usernotfound.jsp"%>
  <html>

<title>Event Management system</title>
<link href="Login.css" rel="stylesheet" type="text/css"  />
<style type="text/css">
/*h1{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:#7fff00;
text-align: center; text-decoration: underline }
*/
 div.quick{border:2px solid black;position:absolute;left:77%;top:25%;background-color:#fffdd0;}
</style>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1 style="font-size:25px"; color:blue; align="center";">Event&nbsp Management System </h1>
			</div>
			
				
		</div>
<body>
<form action="./Login" method="post">
<div align="center">
<input type="image" src="l.jpg" align="right" width="148" height="148" hspace=20">
username :
<input type="text" name="uname"><br><br>
password :
<input type="password" name="password"><br><br>
</br>
<input type="submit" name="submit" value="LogIn"></div></form>


</body>
 
<%String msg=(String)session.getAttribute("errorMessage");
	if(session.getAttribute("errorMessage")==null){
		out.println("welcome");	
		session.invalidate();
	}
	else{
		out.println(msg);
	}
 %>
</html>