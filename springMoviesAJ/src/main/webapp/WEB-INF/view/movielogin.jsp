<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.3/angular-route.min.js"></script>

<script src="resources/app.js" /></script>
<script src="resources/movie_service.js"></script>
<script src="resources/movie_controller.js"></script>
<script src="https://code.jquery.com/jquery-2.2.3.min.js"
	integrity="sha256-a23g1Nt4dtEYOj7bR+vTu7+T8VP13humZFBJNIYoEJo="
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css"
	href="resources/css/bootstrap.css">

<title>Moviemania | Login</title>
</head>
<body>
	<div class="navbar-header navbar-inverse">
		<a class="navbar-brand" href="#"><b>Moviemania</b></a>
		<div class="row">
			<div class="col-xs-6">
				<ul class="nav nav-pills nav-justified">
					<li class="active"><a href="display">Home </a></li>
					<li><a href="insert">Insert Movie </a></li>
					<li><a href="display">Top Rated </a></li>
					<li><a href="#" class="dopdown-toggle" data-toggle="dropdown">More
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu">
							<li><a href="getList">Player
									Stats</a>
							<li><a href="#"> Team Stats</a></li>
							<li><a href="#"> Goals</a></li>
							<li><a href="#">Assists</a></li>
						</ul></li>
					<li><a href="#">Gallery </a></li>
					<li><a href="createUser">Register</a></li>
				</ul>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li class="login"><a href="#">Register</a></li>
			</ul>
		</div>

	</div>
<form name='f' action='${pageContext.request.contextPath}/j_spring_security_check' method='POST'>

		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
	</form>







</body>
</html>