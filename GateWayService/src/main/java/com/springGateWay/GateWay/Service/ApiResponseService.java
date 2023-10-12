package com.springGateWay.GateWay.Service;

import com.springGateWay.GateWay.Pojo.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * This service is used to create the appropriate success and error responses
 * in the specified format to be returned to the client application
 */
@Service
public class ApiResponseService {

    public ApiResponse createSuccessResponse(Boolean result, Integer statusCode, String description, Object response) {
        ApiResponse successResponse = new ApiResponse();

        successResponse.setResult(result);
        successResponse.setStatusCode(statusCode);
        successResponse.setStatusCodeDescription(description);
        successResponse.setResponse(response);

        return successResponse;
    }

    public ApiResponse createErrorResponse(Boolean result, Integer statusCode, String description, String message) {
        ApiResponse errorResponse = new ApiResponse();

        errorResponse.setResult(result);
        errorResponse.setStatusCode(statusCode);
        errorResponse.setStatusCodeDescription(description);
        errorResponse.setMessage(message);

        return errorResponse;
    }

    public ApiResponse createSuccessResponseWithMessage(Boolean result, Integer statusCode, String description, String message, Object response) {
        ApiResponse apiResponse = new ApiResponse();

        apiResponse.setResult(result);
        apiResponse.setStatusCode(statusCode);
        apiResponse.setStatusCodeDescription(description);
        apiResponse.setMessage(message);
        apiResponse.setResponse(response);
        return apiResponse;
    }

    //Method which builds the api error response
    public ApiResponse buildApiResponse(HttpStatus httpStatus, String message) {
    	Boolean result = httpStatus.value() == 201 || httpStatus.value() == 200;
    	
        //Construct the api response
        ApiResponse apiResponse = this.createErrorResponse(
        		result,
                httpStatus.value(),
                httpStatus.getReasonPhrase(),
                message);

        return apiResponse;
    }

    public ApiResponse buildApiResponse(HttpStatus httpStatus, String message, Object response) {
        Boolean result = httpStatus.value() == 201 || httpStatus.value() == 200;

        //Construct the api response
        ApiResponse apiResponse = this.createSuccessResponseWithMessage(
                result,
                httpStatus.value(),
                httpStatus.getReasonPhrase(),
                message,
                response);

        return apiResponse;
    }

    //Method which builds the api success response
    public ApiResponse buildApiResponse(HttpStatus httpStatus, Object response) {
        //Construct the api response
        ApiResponse apiResponse = this.createSuccessResponse(
                true,
                httpStatus.value(),
                httpStatus.getReasonPhrase(),
                response);

        return apiResponse;
    }
}
