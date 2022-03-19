package com.example.zerobase.web.advice;

import com.example.zerobase.web.exception.ExceptionCode;
import com.example.zerobase.web.exception.ZerobaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // TODO : 익셉션 핸들러를 작성하세요
    @ExceptionHandler(value = ZerobaseException.class)
    public ResponseEntity<ErrorResult> runtimeException(ZerobaseException e) {
        ExceptionCode errorCode = e.getCode();
        ErrorResult result = ErrorResult.builder()
                .code(errorCode.name())
                .message(e.getMessage())
                .build();
        return new ResponseEntity(result, errorCode.getStatus()); }
}
