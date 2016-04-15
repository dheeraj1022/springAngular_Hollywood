'use strict';

myApp.factory('movieService',['$http','$q',function($http,$q){

	
	return {
		
		insertMovie: function(movies){
			
			return $http.post('http://localhost:8080/SpringAngular/movies/',movies).then(
					function(response){
						return response.data;
					},
					function(errResponse){
						console.error('Error while creating Movie');
                        return $q.reject(errResponse);
					}
					);
		} ,
		
		displayMovies: function(){
			
			return $http.get("http://localhost:8080/SpringAngular/movies/").then
			(function(response){
				return response.data;
				
			},
			function(errResponse){
			console.error('Error Fetching the movies');
		}
					);
		}
		
		
	};
	
	
	
	
}]);

