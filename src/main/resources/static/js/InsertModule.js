var menuModule = angular.module('InsertModule', []);

menuModule.controller('InsertController', function($scope, $http) {
	var urlBase = "http://localhost:8080";
	$scope.name = "";
	$scope.age = "";
	$http.defaults.headers.post["Content-Type"] = "application/json; charset=UTF-8";
	$scope.addPerson = function addPerson() {
		if($scope.name=="" || $scope.age==""){
			alert("All values must be set.");
		} else{
			$http.post(urlBase + '/persons', {
				name: $scope.name,
				age: $scope.age
			})
			.success(function(data, status, headers) {
				$scope.name = "";
				$scope.age = "";
			}).error(function(data, status, headers) {
				alert("Person not added.");
			});
		}
	};
});