package com.java9.web.service;

import com.java9.web.bean.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public interface UserService {
    public int addUser(User user);
}
