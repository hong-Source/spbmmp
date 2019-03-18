package com.hong.api.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hong.model.system.SysRole;
import com.hong.service.system.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Gumh
 * @since 2019-03-18
 */
@RestController
@RequestMapping("/sys/role")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("getall")
    public String getAll(){
        List<SysRole> list = sysRoleService.list(new QueryWrapper<SysRole>());
        return list.toString();
    }

}

