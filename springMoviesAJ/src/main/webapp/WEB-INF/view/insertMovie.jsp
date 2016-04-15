<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
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

<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="navbar-header navbar-inverse">
          <a class="navbar-brand" href="#"><b>Moviemania</b></a>
        <div class="row">
            <div class="col-xs-6">
                <ul class="nav nav-pills nav-justified">
                    <li class="active"><a href="display">Home </a></li>
                    <li><a href="insert" >Insert Movie </a></li>
                    <li><a href="display">Top Rated </a></li>
                    <li><a href="#" class="dopdown-toggle" data-toggle="dropdown">More 
                        <span class="caret"></span></a>
                       <ul class="dropdown-menu">
                           <li><a href="getList"
                           >Player Stats</a>
                         <li> <a href="#"> Team Stats</a></li>
                           <li><a href="#"> Goals</a> </li>
                        <li><a href="#">Assists</a> </li>
                        </ul>   
                    </li>
                    <li><a href="#">Gallery </a></li>
                    <li><a href="createUser">Register</a></li>
                </ul>         
            </div>
        <ul class="nav navbar-nav navbar-right">
         <li class="login"><a href="#">Login</a></li>
         <li class="login"><a href="<c:url value="/logout" />">Logout</a></li>
        </ul>        
        </div>
           
        </div>
	<div ng-controller="movieController as ctrl" class="container-fluid">
		<div class="row">
			<div class="col-sm-6">
			
   <div>
				<form name="movieForm" ng-submit="ctrl.submit()" >
				<label><h2>Enter the Classic !</h2></label>
					<div class="form-group">
						<label for="movieCode">Movie Code</label> 
						<input type="text" class="form-control"
							name="movieCode" ng-model="ctrl.movies.movieCode" id="movieCode" placeholder="Enter the movie code" required ng-minlength="1">
						<label for="movieName">Movie Title</label> <input type="text"
							name="movieName" ng-model="ctrl.movies.movieName" class="form-control" id="movieName"
							placeholder="enter the movie name" required ng-minlength="1">
						<label for="imdbRating">IMDB Rating</label> <input type="text"
							name="imdbRating" class="form-control" ng-model="ctrl.movies.imdbRating"
							id="imdbRating"> <label for="releaseDate">Release
							Data</label> <input type="text" class="form-control" name="Release Date"
							ng-model="ctrl.movies.releaseDate" id="releaseDate"> <input
							type="submit" class="btn btn-default" value="submit" ng-click="ctrl.redirect()" >
					</div>
				</form>
				
				</div>
				


			</div>
		</div>
	</div>


</body>
</html>