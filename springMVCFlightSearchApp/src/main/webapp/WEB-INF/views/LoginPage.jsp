<html>
<head>
<%@include file="./base.jsp"%>
<<style>
<%@include file="/WEB-INF/views/css/index.css"%>
</style>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


</head>
<body>
	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<div class="col-md-offset-5 col-md-4 text-center">

				     
		<form class="form-login"  action="afterlogin" method="post" >
           
            <h1 class='form text-white'>Flight Search</h1>
              <div class="form"></br>
                <h4>Secure Login</h4>
                </br>
                <input type="text" id="userName" class="form-control input-sm chat-input"  name="userName" placeholder="username"/>
                </br></br>
                <input type="password" id="userPassword" class="form-control input-sm chat-input" name="userPassword" placeholder="password"/>
                </br></br>
                <div class="wrapper">
                        <span class="group-btn">
                            <button type="Submit" class="btn btn-danger btn-md">login <i class="fa fa-sign-in"></i></button>
                        </span>
                       
                      
                  </form>
				<%-- <form:form method="POST" action="afterlogin"
					modelAttribute="users">
					<form:label path="name">Name</form:label>
					<form:input path="userName" />
					<form:label path="password">Password</form:label>
					<form:input path="userPassword" />
					<input type="submit" value="Submit" />
				</form:form> --%>

			</div>
		</div>
		<div class="form-login">
			<%
				if (request.getAttribute("authorized") != null) {
			%>
			<h1 class="form text-warning">Invalid User</h1>
			<%
				request.setAttribute("authorized", null);
				}
			%>
		</div>
	</div>

	</div>
	</br>
	</br>
	</br>

	</div>
</body>
</html>
