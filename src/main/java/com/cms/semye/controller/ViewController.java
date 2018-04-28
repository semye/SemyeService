package com.cms.semye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by semye on 2018/4/2.
 */
@Controller
@RequestMapping("/usercenter")
public class ViewController {


    @RequestMapping("/home")
    public ModelAndView loginSuccess() {
        return new ModelAndView("./home/admin.html");
    }
}
