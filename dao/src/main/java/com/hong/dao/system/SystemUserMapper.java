package com.hong.dao.system;

import com.hong.model.system.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SystemUserMapper {

    @Select("select * from system_user")
    List<SystemUser> findAll();
}
