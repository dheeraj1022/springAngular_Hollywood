var routeApp = angular.module("routeApp",["ngRoute"]).config(function($routeProvider) {
    $routeProvider.when("/home",{
        templateUrl: "home.html",
        controller: "routeController"
    });
    
});