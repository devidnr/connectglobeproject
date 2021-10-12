<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link href="../home.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

 <style><%@include file="/WEB-INF/views/home.css"%></style>  
</head>
<body>
 <%@ include file="/WEB-INF/views/heading.jsp" %> 
 
<div class="topnav">
<a href="#" class=" active btn btn-primary btn-lg " role="button" aria-disabled="true">Home</a>
<a href="#" class="btn btn-secondary btn-lg " role="button" aria-disabled="true">My Posts</a>
<a href="#" class="btn btn-info btn-lg " role="button" aria-disabled="true">Problems</a>
<a href="#" class="btn btn-dark btn-lg " role="button" aria-disabled="true">My Problems</a>
<a href="/post" class="btn btn-primary btn-lg " role="button" aria-disabled="true">Posts</a>
<a href="#" class="btn btn-secondary btn-lg " role="button" aria-disabled="true">Profile</a>
</div>
 <%-- <%@ include file="/WEB-INF/views/Reports.jsp" %> 
 --%>
</body>
</html>