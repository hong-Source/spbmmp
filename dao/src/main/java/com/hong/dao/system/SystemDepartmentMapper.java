package com.hong.dao.system;

import com.hong.model.system.SystemDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SystemDepartmentMapper {

    List<SystemDepartment> findAll();
}
