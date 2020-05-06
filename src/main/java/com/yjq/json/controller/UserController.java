package com.yjq.json.controller;

import com.yjq.json.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/user")
    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("yaojiuqi>>>" +i);
            user.setAddress("com.yjq>>>" +i);
            user.setBirthday(new Date());
            users.add(user);
        }
        return users;
    }
}
