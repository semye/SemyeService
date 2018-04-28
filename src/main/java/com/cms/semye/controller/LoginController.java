package com.cms.semye.controller;

import com.cms.semye.bean.Response;
import com.cms.semye.bean.User;
import com.cms.semye.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by semye on 2018/4/16.
 */
@Controller
@RequestMapping("/api")
public class LoginController {


    @Autowired
    private LoginService loginService;


    /**
     * post请求
     * <p>
     * http://localhost:8080/api/login
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public
    @ResponseBody
    Response<User> login(@RequestParam String username, @RequestParam String password) {
        return loginService.login(username, password);
    }

    /**
     * post请求
     * <p>
     * http://localhost:8080/api/register
     *
     * @param username 用户名
     * @param password 密码
     * @param mobile   手机号
     * @return
     */
    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    public
    @ResponseBody
    Response<User> register(@RequestParam String username, @RequestParam String password, @RequestParam String mobile) {
        return loginService.register(username, password, mobile);
    }


}
