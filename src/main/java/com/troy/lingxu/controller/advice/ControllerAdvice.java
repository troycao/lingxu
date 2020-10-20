package com.troy.lingxu.controller.advice;

import com.troy.lingxu.common.Result;
import com.troy.lingxu.common.enums.CodeEnum;
import com.troy.lingxu.common.exception.LingXuException;
import org.slf4j.Logger;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.DataTruncation;

@RestControllerAdvice(basePackages = "com.troy.lingxu.controller")
public class ControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    public Result<?> exception(Exception exception){
        if (exception instanceof BadSqlGrammarException) {
            return Result.error();
        }
        if (exception instanceof DataTruncation) {
            return Result.error();
        }
        return Result.error(exception.getMessage());
    }

    @ExceptionHandler(value = LingXuException.class)
    public Result<?> lingXuException(LingXuException exception){
        return Result.error(exception);
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

    }
}
