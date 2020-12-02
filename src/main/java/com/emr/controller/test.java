package com.emr.controller;

import com.alibaba.fastjson.JSON;
import com.emr.annotation.testAnnotation;
import com.emr.dao.Archive_MasterMapper;
import com.emr.dao.JswzhSendmessageMapper;
import com.emr.entity.Archive_Master;
import com.emr.entity.JswzhSendmessage;
import com.emr.entity.Power_Role;
import com.emr.service.PowerRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * @ProjectName:
 * @Description:
 * @Param 传输参数
 * @Return
 * @Author: 曾文和
 * @CreateDate: 2020/11/23 15:11
 * @UpdateUser: 曾文和
 * @UpdateDate: 2020/11/23 15:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
public class test {
    @Autowired
    private PowerRoleService powerRoleService;
    @Autowired
    private Archive_MasterMapper masterMapper;
    @Autowired
    private JswzhSendmessageMapper jswzhSendmessageMapper;
    @RequestMapping("test")
    @ResponseBody
    public String test() {
        List<Power_Role> list = powerRoleService.selectAll();
        //List<Archive_Master> list = masterMapper.selectAll();
        //List<JswzhSendmessage> list = jswzhSendmessageMapper.selectAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("test1")
    @testAnnotation(modelName = "注解属性值he好")
    public String test1() {
        return "page/main";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2(String name) {
        int count = 0;
        try {
            count = powerRoleService.iensert111(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return name+count;
    }

    @RequestMapping(value="test4",method = RequestMethod.POST)
    public void test2(MultipartFile file) throws Exception{
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        file.transferTo(new File("d:\\1.jpg"));
    }
}
