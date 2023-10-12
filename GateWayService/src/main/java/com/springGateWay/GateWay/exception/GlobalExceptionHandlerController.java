package com.springGateWay.GateWay.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springGateWay.GateWay.Constant.ErrorMessages;
import com.springGateWay.GateWay.Pojo.ApiResponse;
import com.springGateWay.GateWay.Service.ApiResponseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

/**
 * This is the global exception handler for the entire application.
 * Both language defined and custom exceptions are handled here.
 */
@RestControllerAdvice
public class GlobalExceptionHandlerController {

    @Autowired
    ApiResponseService apiResponseService;

    private static final Logger LOGGER = LogManager.getLogger(GlobalExceptionHandlerController.class);

    //Handlers for custom (or) user defined exceptions
    //Resource Not Found Exception - When database is queried for non-existent resource
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(value = ResourceNotFoundException.class)
//    public ApiResponse handleResourceNotFoundException(HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside Resource Not Found Exception");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        // Get the message from exceptions If not present get the default error message.
//        String message = ex.getMessage() != null ? ex.getMessage() : ErrorMessages.RESOURCE_NOT_FOUND;
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.NOT_FOUND, message);
//    }

    //Input Parameters Related Exceptions - When parameters don't satisfy the required conditions
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler({
//            MissingServletRequestParameterException.class,
//            MethodArgumentNotValidException.class,
//            InvalidValueProvidedException.class,
//            IllegalArgumentException.class})
//    public ApiResponse handleInputParameterRelatedExceptions (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside Input Parameters Related Exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
//    }

    //Method Not Allowed / Supported Exception
//    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
//    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
//    public ApiResponse handleMethodNotSupportedException (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside Method Not Supported Exception Handler");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.METHOD_NOT_ALLOWED, ErrorMessages.METHOD_NOT_ALLOWED);
//    }
    
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({
    	UnAuthorizedException.class,
    })
    public ApiResponse handleUnAuthorizedException (HttpServletRequest request, Exception ex) {
    	LOGGER.debug("Inside Method unAuthorized Exception Handler");
        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
        
        // Get the message from exceptions If not present get the default error message.
        String message = ex.getMessage() != null ? ex.getMessage() : ErrorMessages.UNAUTHORIZED_ACCESS;

        //Build the Error response
        return apiResponseService.buildApiResponse(HttpStatus.UNAUTHORIZED, message);
    }
    
    //Method IncorrectPassword Exception
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({
    	InvalidTokenException.class,
    	InCorrectPasswordException.class,
    	NoSuchUserException.class,
            ResourceAccessException.class,
            HttpClientErrorException.class
//            MailAuthenticationException.class,
//            MailException.class
    })
    public ApiResponse handleIncorrectPasswordException (HttpServletRequest request, Exception ex) {
    	LOGGER.debug("Inside Method Incorrect Password/InvalidToken/NoSuchUser Exception Handler");
        LOGGER.debug("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());

        // Get the message from exceptions If not present get the default error message.
        String message = ex.getMessage() != null ? ex.getMessage() : ErrorMessages.UNAUTHORIZED;

        //Build the Error response
        return apiResponseService.buildApiResponse(HttpStatus.UNAUTHORIZED, message);
    }
    
    //Method UserLocked Exception
//    @ResponseStatus(HttpStatus.LOCKED)
//    @ExceptionHandler(value = UserLockedException.class)
//    public ApiResponse handleUserLockedException (HttpServletRequest request, Exception ex) {
//    	LOGGER.debug("Inside Method User Locked Exception Handler");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Build the Error response
//        return apiResponseService.buildApiResponse(HttpStatus.LOCKED, ErrorMessages.USER_LOCKED);
//    }
    
    //Method Invalid Password Exception
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(value = InvalidPasswordException.class)
//    public ApiResponse handleInvalidPasswordException (HttpServletRequest request, Exception ex) {
//    	LOGGER.debug("Inside Method Invalid Password Exception Handler");
//    	LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Build the Error response
//        return apiResponseService.buildApiResponse(HttpStatus.BAD_REQUEST, ErrorMessages.BAD_AUTH_CREDENTIALS);
//    }

    //Handler for Specific Runtime Exceptions
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler({ NullPointerException.class, IOException.class, SQLException.class})
//    public ApiResponse handleSpecificExceptions (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside handler of specific runtime exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        ex.printStackTrace();
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.INTERNAL_SERVER_ERROR, ErrorMessages.INTERNAL_SERVER_ERROR);
//    }
    
    
  //Handler for Other Runtime Exceptions
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler({
//            DbActionExecutionException.class,
//            DataIntegrityViolationException.class
//    })
//    public ApiResponse handleDataIntegrityViolationExceptions (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside handler of Data integrity violation exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//        ex.printStackTrace();
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
//    }
    
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(value = DuplicateKeyException.class)
//    public ApiResponse handleDuplicateKeyExceptionExceptions (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside handler of Data integrity violation exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//        LOGGER.error("Error root Caused "+ex.getCause().getMessage());
//        ex.printStackTrace();
//
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.BAD_REQUEST, ex.getCause().getMessage());
//    }
    
    
    

    //Handler for Other Runtime Exceptions
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = Exception.class)
//    public ApiResponse handleOtherExceptions (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside handler of other generic runtime exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + ex.getClass().getName() + " Exception " + ex.getMessage());
//        ex.printStackTrace();
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.INTERNAL_SERVER_ERROR,ex.getMessage());
//    }

    //Method which logs the class and method name where the exception occurred
    //N.B : Only the top level exception is considered
//    private void logExceptionLocation(Exception ex) {
//        //Check if stack trace exists for the method before logging it
//        if (ex.getStackTrace().length > 0) {
//            StackTraceElement stackTraceElement = ex.getStackTrace()[0];
//
//            LOGGER.debug("Class Name " + stackTraceElement.getClassName());
//            LOGGER.debug("Method Name " + stackTraceElement.getMethodName());
//        }
//        else {
//            LOGGER.debug("No stack trace information found ");
//        }
//    }
    
    
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler({
//    	ExpiredJwtException.class,
//    })
//    public ApiResponse handleTokenExpiredException (HttpServletRequest request, Exception ex) {
//    	LOGGER.debug("Inside Method Invalid Captcha Exception Handler");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Build the Error response
//        return apiResponseService.buildApiResponse(HttpStatus.UNAUTHORIZED, ErrorMessages.INVALID_TOKEN);
//    }
    
    
    
  //Method Invalid Captcha Exception
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler({
//    	InvalidCaptchaException.class,
//    })
//    public ApiResponse handleInvalidCaptchaException (HttpServletRequest request, Exception ex) {
//    	LOGGER.debug("Inside Method Invalid Captcha Exception Handler");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Build the Error response
//        return apiResponseService.buildApiResponse(HttpStatus.UNAUTHORIZED, ErrorMessages.INVALID_CAPTCHA);
//    }
    
    //Method Invalid Captcha Exception
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler({
//    	InvalidOtpException.class,
//    })
//    public ApiResponse handleInvalidOtpException (HttpServletRequest request, Exception ex) {
//    	LOGGER.debug("Inside Method Invalid Otp Exception Handler");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//
//        //Build the Error response
//        return apiResponseService.buildApiResponse(HttpStatus.UNAUTHORIZED, ErrorMessages.INVALID_OTP);
//    }
//
    //method Invalid Rest client execption
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler({
//    	RestClientException.class,
//    	JsonProcessingException.class,
//    	MissingRoleIdOrClientIdException.class
//    })
//    public ApiResponse handleRestClientException (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside handler of Rest Client Exception exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//        ex.printStackTrace();
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
//    }
    
//    //method Invalid Rest client execption
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler({
//    	NoSuchCustomerException.class
//    })
//    public ApiResponse handleNoSuchCustomerException (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside handler of Rest Client Exception exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//        ex.printStackTrace();
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
//    }


    // Invalid Token client execption
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler({
//            VerificationException.class
//    })
//    public ApiResponse handleVerificationException (HttpServletRequest request, Exception ex) {
//        LOGGER.debug("Inside handler of Rest Client Exception exceptions");
//        LOGGER.error("Request endpoint " + request.getRequestURL() + " Exception " + ex.getMessage());
//        ex.printStackTrace();
//
//        //Log the class name and method name where exception occurred
//        this.logExceptionLocation(ex);
//
//        //Build the api response
//        return apiResponseService.buildApiResponse(HttpStatus.BAD_REQUEST,ErrorMessages.INVALID_TOKEN);
//    }
    
}
