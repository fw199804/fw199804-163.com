package com.java9.web.service.serviceIMPL;

import com.java9.web.mapper.UserMapper;
import com.java9.web.bean.User;
import com.java9.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {
    @Autowired()
    @Qualifier("userMapper")
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
