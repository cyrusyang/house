package com.mooc.house.web.controller;

import com.mooc.house.common.model.User;
import com.mooc.house.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YangCH
 * create on 2019/4/14
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    
    @RequestMapping("user")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
