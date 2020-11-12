package com.qf.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice("/System")
public class SystemController {


    @RequestMapping("/")
    public String handlerException(HttpServletRequest request, Exception e) {


        request.getHeader("");

        return "";
    }
}
