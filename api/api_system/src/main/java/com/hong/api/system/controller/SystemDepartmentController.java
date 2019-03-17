package com.hong.api.system.controller;

import com.hong.dao.system.SystemDepartmentMapper;
import com.hong.model.system.SystemDepartment;
import com.hong.service.system.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/depart")
public class SystemDepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("/getall")
    public List<SystemDepartment> getAll(){
        return departmentService.getAll();
    }
}
