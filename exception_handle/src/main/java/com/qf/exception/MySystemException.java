package com.qf.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MySystemException implements ErrorController {

    @RequestMapping("/myError")
    public String errorHandle(HttpServletResponse response) {
        int status = response.getStatus();
        if (status == 404) {
            return "404";
        }
        return "error";
    }


    @Override
    public String getErrorPath() {
        return "/myError";
    }
}
