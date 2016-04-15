'use strict';

/*myApp.controller("movieController", function($scope,$http){
	
	$scope.movies = {};
	
	$scope.submit = function(){
		$http({
	          method  : 'POST',
	          url     : 'http://localhost:6838/SpringAngular/movies/',
	          data    : $scope.movies, //forms user object
	          headers : {'Content-Type': 'application/json'} 
	         })
	         .success(function(data) {
	             if (data.errors) {
	               // Showing errors.
	               $scope.errorName = data.errors.movies;
	             } else {
	               $scope.message = data.message;
	             }
	           });
	       
	};
	
	
	
} );*/


myApp.controller('movieController',['$scope','movieService','$location','$window',function($scope,movieService,$location,$window){
	
	var self = this;
	
	self.movies ={};
	self.movieList=[];
	self.status;
	self.sortType='imdbRating';
	
	
	self.insertMovie = function(movies){
		
		 movieService.insertMovie(movies).then(
function(response){
	
	return response.data;
}
		);
			
	};
	
	self.displayMovies = function(){
		movieService.displayMovies().then
		(function(response){
			 self.movieList = response;
			 console.info(response);
		},function(errResponse){
			console.error('error displaying movies');
		}
				);
	};
	
	self.submit = function(){
		self.insertMovie(self.movies);
	
	};
	
	self.display = function(){
		self.displayMovies();
	};
	
	self.redirect = function(){
		//$location.path('/display');
		$window.location.href='http://localhost:6838/SpringAngular/display';
	};
	
	
}]);




