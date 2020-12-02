package com.emr.service;

import com.emr.dao.Power_RoleMapper;
import com.emr.entity.Power_Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName:
 * @Description:
 * @Param 传输参数
 * @Return
 * @Author: 曾文和
 * @CreateDate: 2020/11/26 15:45
 * @UpdateUser: 曾文和
 * @UpdateDate: 2020/11/26 15:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Transactional
@Service
public class PowerRoleService {
    @Value("${中文好}")
    private String aaaaa;
    @Autowired
    private Power_RoleMapper roleMapper;
    public List<Power_Role> selectAll(){
        return roleMapper.selectAll();
    }

    public int iensert111(String name){
        Power_Role power_role = new Power_Role();
        power_role.setRoleName(name+"2");
        power_role.setCreater("11");
        power_role.setCreateDate("123");
        power_role.setUpdateDate("234");
        power_role.setUpdater("22");
        power_role.setEffective(1);
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        power_role.setRemark(fmt.format(new Date()));
        int insert = 0;
        insert = roleMapper.insert(power_role);
        System.out.println(aaaaa);
        int i = 1/0;
        return insert;
    }
}
