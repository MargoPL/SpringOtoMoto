package pl.sda.otomotospring.OtoMoto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class OtoMotoExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handlePersonNotFoundException(WebRequest request, CarNotFoundException e) {

        return handleExceptionInternal(e, e.getMessage(), null, HttpStatus.NOT_FOUND, request);
    }
}
