package com.hong.service.system.impl;

import com.hong.dao.system.SystemUserMapper;
import com.hong.model.system.SystemUser;
import com.hong.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SystemUserMapper userMapper;

    @Override
    public List<SystemUser> getAll() {
        return userMapper.findAll();
    }
}
