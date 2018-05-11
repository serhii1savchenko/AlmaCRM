package com.my.alma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionHandlerController {

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(){
        return "/403";
    }

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String pageNotFound(){
        return "/404";
    }

}
