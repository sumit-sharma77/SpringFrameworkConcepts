<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is called by home controller</h1>
	
	<% String name=(String)request.getAttribute("name"); %>
	
	<h2>This is data from model <%= name %></h2>
	<h1>this data is printed if we do not want to use getAttribute = ${name }</h1>
</body>
</html>