package com.cms.semye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;

/**
 * Created by semye on 2017/11/26.
 */
@Controller
public class UserCenterController {


    /**
     * <p>
     * http://localhost:8080/usercenter
     *
     * @param
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value = "/usercenter", method = {RequestMethod.GET})
    public ModelAndView getLoginView() throws UnsupportedEncodingException {
        return new ModelAndView("admin.html");
    }
}
