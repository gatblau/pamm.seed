"use strict";

angular.module("pamm").constant("httpStatus", {
    OK: 200,
    BAD_REQUEST: 400,
    UNAUTHORIZED: 401,
    FORBIDDEN: 403,
    NOT_FOUND: 404,
    INTERNAL_ERROR: 500,
    NOT_IMPLEMENTED: 501
});
