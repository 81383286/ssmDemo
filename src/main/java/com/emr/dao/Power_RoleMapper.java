package com.emr.dao;

import com.emr.entity.Power_Role;

import java.util.List;

public interface Power_RoleMapper {
    List<Power_Role> selectAll();

    int insert(Power_Role power_role);
}