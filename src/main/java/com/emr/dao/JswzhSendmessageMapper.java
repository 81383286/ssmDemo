package com.emr.dao;

import com.emr.entity.JswzhSendmessage;

import java.util.List;

public interface JswzhSendmessageMapper {
    int insert(JswzhSendmessage record);

    int insertSelective(JswzhSendmessage record);

    List<JswzhSendmessage> selectAll();
}