package az.iktlab.bookstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler
    public ErrorResponse handleUserNotFoundException(UserNotFoundException exception){
        return response(exception,HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler
    public ErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        final String[] message = {""};
                exception.getBindingResult().getAllErrors().forEach((error) -> {
            message[0] = error.getDefaultMessage();
        });
        return new ErrorResponse(HttpStatus.NO_CONTENT.value(), message[0],LocalDateTime.now());
    }

    private <T extends RuntimeException> ErrorResponse response(T exception, int statusCode){
        return new ErrorResponse(statusCode,exception.getMessage(),LocalDateTime.now());
    }
}
