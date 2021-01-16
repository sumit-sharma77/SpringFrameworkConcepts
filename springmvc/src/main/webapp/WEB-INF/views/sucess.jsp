<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
</head>
<body>

<%-- <h1>Welcome , ${name }</h1>
<h1>your email is ${email }</h1>
<h1>Your password is ${password }</h1> --%>

<h1>Welcome , ${user.username }</h1>
<h1>your email is ${user.email }</h1>
<h1>Your password is ${user.password }</h1>

</body>
</html>