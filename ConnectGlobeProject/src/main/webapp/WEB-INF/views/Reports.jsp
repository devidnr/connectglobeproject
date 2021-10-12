<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">

<style>
.card{
padding-left:2%;
padding-right:2%;
padding-top:1%;
}
.b{
margin-left:45%;
margin-right:45%;
margin-top:2%;
}
</style>
</head>
<body>
<%@ include file="/WEB-INF/views/home.jsp" %> 
 <a href="#" class=" b btn btn-primary">Add Post</a>
 
 <c:forEach items="${listPosts}" var="item">
<div class="card ">
  <div class="card-header">
  Posted By <b>User Name</b>
  </div>
  <div class="card-body">
    <h5 class="card-title">post tag ${item.problem}</h5>
    <p class="card-text">post content.</p>
  </div>
  <div class="card-footer text-muted">
       <a href="#" class="btn btn-primary">Sugestions</a>

  </div>
</div></c:forEach>
</body>
</html>