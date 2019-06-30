package com.xs.service.impl;


import com.xs.mapper.UserMapper;
import com.xs.pojo.User;
import com.xs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {


    //自动注入UserMapper
    @Autowired
    private UserMapper userMapper;


    @Override
    public User get(User user) {
        //提前检查


        User u=userMapper.select(user);

        return u;
    }
}
