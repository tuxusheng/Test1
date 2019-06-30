package com.xs.service;

import com.xs.pojo.User;

public interface UserService {

    /**
     * 根据user信息去数据库检查用户是否存在
     *
     * @param user
     * @return
     */
    User get(User user);

}
