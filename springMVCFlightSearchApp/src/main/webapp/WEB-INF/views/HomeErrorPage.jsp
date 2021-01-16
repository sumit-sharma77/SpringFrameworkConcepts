<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>

<style>
<%@include file="/WEB-INF/views/css/homepage.css"%>
</style>
<meta charset="ISO-8859-1">
</head>
<body>
<div class="container"><a class="border bg-primary"href="${pageContext.request.contextPath}/" style="font-size: 30px;color:white;border: 1px">Sign-Out<i class="fas fa-sign-out-alt" style=""></i></a></div>
	<div class="container mt-4  p-5 ">

		<form class="form_container" action="search-Flights"method="post">
			<h1 class="text-center">Search Flights</h1>
			<hr>
			<br>
			<h4 class="text-center">Enter Flights Detail</h4>
				
			<div class="form-group row">
				<label for="inputFlightDeparture" class="col-sm-2 col-form-label">Enter
					Departure</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="departure"
						name="departure" placeholder="Enter Departure Location" value="${departure}">
					<div class="col-sm-10 text-danger">${errorList.get("departure") }</div>
				</div>
			
			</div>
		
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Enter
					Arrival</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="arrival" name="arrival"
						placeholder="Enter Arrival Location" value="${ arrival}">
						<div class="col-sm-10 text-danger">${errorList.get("arrival") }</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Date</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="date" name="date"
						placeholder="Enter date" value="date">
						<div class="col-sm-10 text-danger">${errorList.get("date") }</div>
				</div>
			</div>

			<div class="form-group row">
				<label class="col-sm-2 col-form-label"
					for="inlineFormCustomSelectPref">Select Flight Class</label>
				<div class="col-sm-10">
					<select class="form-control" id="flightClass" name="flightClass" >
						<option selected value="c">Choose...</option>
						<option value="E">Economy</option>
						<option value="B">Business</option>
					</select>
					<div class="col-sm-10 text-danger">${errorList.get("flightClass") }</div>
				</div>
			</div>

			<fieldset class="form-group">
				<div class="row">
						<label class="col-form-label col-sm-2 pt-0">SelectDisplay Preference</label>
					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="radio" name="sortedBy"
								id="gridRadios1" value="fare" checked> <label
								class="form-check-label" for="gridRadios1"> Sorted by Fare </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="sortedBy"
								id="gridRadios2" value="both"> <label
								class="form-check-label" for="gridRadios2"> Sorted by Fare and Duration </label>
						</div>
					</div>
				</div>
			</fieldset>


			<div class="form-group row text-center">
				<div class="col-sm-10">
					<button type="submit" class="btn btn-primary">Search
						Flights</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>