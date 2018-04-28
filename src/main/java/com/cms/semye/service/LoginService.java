package com.cms.semye.service;

import com.cms.semye.bean.Response;
import com.cms.semye.bean.User;

/**
 * Created by semye on 2018/4/16.
 */
public interface LoginService {


    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    Response<User> login(String username, String password);

    /**
     * 注册
     *
     * @param username
     * @param password
     * @param mobile
     * @return
     */
    Response<User> register(String username, String password, String mobile);

}
