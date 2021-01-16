<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
<%@include file="/WEB-INF/views/css/homepage.css"%>
</style>
 <script
  src="http://code.jquery.com/jquery-3.3.1.min.js"
  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
  crossorigin="anonymous"></script>
   <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
  <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js" ></script>
</head>
<body>
<div class="container mt-3">
<a class="border bg-primary"href="${pageContext.request.contextPath}/" style="font-size: 30px;color:white;border: 1px">Sign-Out<i class="fas fa-sign-out-alt" style=""></i></a>
<a class="border bg-primary"href="${pageContext.request.contextPath}/homepage" style="font-size: 30px;color:white;border: 1px">Search-Again<i class="fas fa-search" style=""></i></a>
</div>
	<div class="container mt-4  p-5">
	<h1 class="table1 text-center">Available Flights</h1>
		<table class="table " id="myTable">
			<thead class="thead-light">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Flight Name</th>
					<th scope="col">Flight No</th>
					<th scope="col">Departure</th>
					<th scope="col">Arrival</th>
					<th scope="col">Date</th>
					<th scope="col">Flight Time</th>
					<th scope="col">Flight Duration</th>
					<th scope="col">Fare</th>
					<th scope="col">Seat Availability</th>
					<th scope="col">Flight Class</th>
				</tr>
			</thead>
			<tbody>
						<c:forEach items="${flightData }" var="p">
							<tr>
								<th scope="row">${p.id }</th>
								<td>${p.csvName }</td>
								<td>${p.flightNo }</td>
								<td>${p.departure }</td>
								<td>${p.arrival }</td>
								<td>${p.date }</td>
								<td>${p.flightTime }</td>
								<td>${p.flightDuration }</td>
								<td class="font-weight-bold">&#8377;${p.fare }</td>
								<td class="text-center">${p.seatAvailability }</td>
								<td>${p.flightClass }</td>
							</tr>
						</c:forEach>
					</tbody>
		</table>
	</div>
	<script>
    $(document).ready( function () {
    $('#myTable').DataTable();
} );
    </script>
</body>
</html>