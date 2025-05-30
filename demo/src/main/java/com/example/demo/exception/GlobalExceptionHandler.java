package com.example.demo.exception;


import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public record ApiError(
            String field,
            String message,
            String errorCode
    ) {}

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ApiError>> handleValidationExceptions(
            MethodArgumentNotValidException ex
    ) {
        List<ApiError> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> new ApiError(
                        error.getField(),
                        error.getDefaultMessage(),
                        "VALIDATION_ERROR"
                ))
                .collect(Collectors.toList());

        return ResponseEntity.badRequest().body(errors);
    }
}
