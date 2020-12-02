package com.emr.service;

import com.emr.dao.Archive_MasterMapper;
import com.emr.entity.Archive_Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName:
 * @Description:
 * @Param 传输参数
 * @Return
 * @Author: 曾文和
 * @CreateDate: 2020/11/26 14:12
 * @UpdateUser: 曾文和
 * @UpdateDate: 2020/11/26 14:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class ArchiveMasterService {
    @Autowired
    private Archive_MasterMapper masterMapper;
    public List<Archive_Master> selectAll(){
        return masterMapper.selectAll();
    }
}
