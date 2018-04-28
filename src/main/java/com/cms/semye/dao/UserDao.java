package com.cms.semye.dao;

import com.cms.semye.bean.User;

/**
 * Created by semye on 2017/11/26.
 */
public interface UserDao {


    /**
     * 查询一个用户
     *
     * @param user user
     * @return
     */
    User queryUser(User user);

    /**
     * 插入一个用户
     *
     * @param user user
     */
    void insertUser(User user);

    /**
     * 删除一个用户
     *
     * @param user user
     */
    void deleteUser(User user);


    /**
     * 更新用户信息
     *
     * @param user user
     */
    void updateUser(User user);
}
