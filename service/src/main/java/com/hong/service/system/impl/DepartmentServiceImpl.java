package com.hong.service.system.impl;

import com.hong.dao.system.SystemDepartmentMapper;
import com.hong.model.system.SystemDepartment;
import com.hong.service.system.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private SystemDepartmentMapper departmentMapper;

    @Override
    public List<SystemDepartment> getAll() {
        List<SystemDepartment> departmentList = departmentMapper.findAll();
        return departmentList;
    }
}
