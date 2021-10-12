
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
.bod{
width:70%;
padding-left:30%;
}
.con{
background-color:#CCCCFF;
text-align:center;
padding-top:5%;
padding-bottom:5%;
width:50%;
border-radius:15%;
}
.center {
  margin-left: auto;
  margin-right: auto;
 
}

</style>
<title>Login</title>
</head>
<body>

<%@ include file="heading.jsp" %> 
<div class="bod">
<div class="container my-5 con">
<h1>  Login  </h1>
				
					<c:if test="${not empty error}">
			<p style="color:red;">${error}</p>
		</c:if>
<form action="login" method="post">
<table class="center">
<tr><td>User Name :</td><td><input type="email" id ="email" name = "email"
						placeholder="Enter Email ID" autofocus="autofocus"></td></tr>
<tr><td>password :</td><td><input type="password"
							id="password" name="password" 
							placeholder="Enter Password"  required/></td></tr>
<tr><td colspan="2"><input type="submit" class=" btn btn-primary" value="login"/></td></tr>
<tr><td colspan="2">If you are new User?<a href="register" >Register</a></td></tr>
</table>
</form>
</div>
</div>
</body>
</html>