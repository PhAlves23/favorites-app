package br.com.fiap.favoritesapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class RestExceptionHandler {

    Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<RestValidationError>> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        log.error("Validation error");
        List<RestValidationError> errors = new ArrayList<>();
        e.getFieldErrors().forEach(v -> errors.add(new RestValidationError(v.getField(), v.getDefaultMessage())));
        return ResponseEntity.badRequest().body(errors);
    }
}
