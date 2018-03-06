package com.tfss.generate.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tfss.generate.dto.Admin;
import com.tfss.generate.dto.AdminExample;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);
}