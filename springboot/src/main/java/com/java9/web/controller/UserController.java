package com.java9.web.controller;

import com.java9.web.bean.User;
import com.java9.web.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login")
    @ResponseBody
    public Map<String,Object> login(@RequestBody User user, HttpSession session){
        int res = 0;
        Map<String,Object> map = null;
        if("" == user.getUsername()||null==user.getUsername()){
            map.put("msg", -1);
            return map;
        }else {
            try {
                res = userService.addUser(user);
                map = new HashMap<>();
                if(res > 0 ){
                    map.put("msg",1);
                }else {
                    map.put("msg", -1);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return map;
            } finally {
                return map;
            }
        }
    }
    @RequestMapping(value = "/hello")
    public String hello() {
        return "user/hello";
    }


}
