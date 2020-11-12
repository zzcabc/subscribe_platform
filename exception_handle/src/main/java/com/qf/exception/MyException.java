package com.qf.exception;


import com.qf.entity.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyException {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object MyExceptionHandle(HttpServletRequest request, Exception e) {

        String header = request.getHeader("X-Requested-With");
        if ("XMLHttpRequest".equals(header)) {
            return new R().setCode(R.STATUS.FAILED).setMsg("服务器繁忙，请稍后重试");
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
