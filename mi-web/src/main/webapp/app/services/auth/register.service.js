(function () {
    'use strict';

    angular
        .module('mockupinterviewApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
