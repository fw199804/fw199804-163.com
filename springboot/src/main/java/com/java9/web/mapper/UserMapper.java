package com.java9.web.mapper;

import com.java9.web.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public  int addUser(@Param("user") User user);
}
