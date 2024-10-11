package com.pgm.springdemo.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(NumberFormatException.class)
    public String exceptionNumberFormat(NumberFormatException e) {
        System.out.println("---------------------------------");
        System.out.println(e.getMessage());

        return "NumberFormatException";
    }
}
