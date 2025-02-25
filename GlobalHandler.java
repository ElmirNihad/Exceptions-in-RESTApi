package org.example.exceptionsrestapi.Handler;

import org.example.exceptionsrestapi.Exceptions.Baseexceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(value = Baseexceptions.class)
    public ResponseEntity<ApiError> HandleBaseExceptions(Baseexceptions exception , WebRequest request) {
        return ResponseEntity.badRequest().body(createApiError(exception.getMessage() , request));
    }

    public<E> ApiError<E> createApiError(E message , WebRequest request){
        ApiError<E> error = new ApiError();
        Exception<E> exception = new Exception<>();
        error.setStatus(HttpStatus.BAD_REQUEST.value());

        exception.setCreateTime(new Date());
        exception.setHostname(gethostname());
        exception.setPath(request.getDescription(false).substring(4));
        exception.setMessage(message);

        error.setException(exception);
        return error;
    }

    private String gethostname(){
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.out.println("Hata Olusdu" + e.getMessage());
        }
        return null;
    }


}
