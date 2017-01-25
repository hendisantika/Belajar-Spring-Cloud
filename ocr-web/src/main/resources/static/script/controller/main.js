/**
 * Created by hendisantika on 25/01/17.
 */
angular.module('ocrApp')
    .controller('MainCtrl', function ($scope, $http) {
        $http({
            method: 'GET',
            url: 'http://localhost:8282/races'
        }).then(function(response) {
            $scope.races = response.data;
        }, function(response) {
            console.error('Error requesting races');
        });
    });