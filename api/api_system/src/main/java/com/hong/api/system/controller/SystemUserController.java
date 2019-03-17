package com.hong.api.system.controller;

import com.hong.model.system.SystemUser;
import com.hong.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class SystemUserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getall")
    public List<SystemUser> getAllUser(){
        List<SystemUser> all = userService.getAll();

        return all;
    }
}
