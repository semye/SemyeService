package com.cms.semye.service;

import com.cms.semye.bean.Response;
import com.cms.semye.bean.User;
import com.cms.semye.dao.UserDao;
import com.cms.semye.service.LoginService;
import com.cms.semye.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by semye on 2018/4/16.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {


    @Autowired
    private UserDao userDao;

    @Override
    public Response<User> login(String username, String password) {
        Response<User> repResponse = new Response<>();
        try {
            User queryUserParam = new User();
            queryUserParam.setUsername(username);
            queryUserParam.setPassword(Md5Util.getMD5Str(password));
            User user = userDao.queryUser(queryUserParam);
            if (user != null) {
                repResponse.setCode(0);
                repResponse.setMessage("登录成功");
                repResponse.setData(user);
            } else {
                repResponse.setCode(0);
                repResponse.setMessage("登录失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            repResponse.setCode(1);
            repResponse.setMessage("查询用户出错");
        }
        return repResponse;
    }

    @Override
    public Response<User> register(String username, String password, String mobile) {
        Response<User> repResponse = new Response<>();
        try {
            User user = new User();
            user.setUsername(username);
            user.setPassword(Md5Util.getMD5Str(password));
            user.setMobilephone(mobile);
            userDao.insertUser(user);
            repResponse.setCode(0);
            repResponse.setMessage("注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            repResponse.setCode(1);
            repResponse.setMessage("注册失败");
        }
        return repResponse;
    }
}
