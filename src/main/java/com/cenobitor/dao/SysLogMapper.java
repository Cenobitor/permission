package com.cenobitor.dao;

import com.cenobitor.model.SysLog;
import com.cenobitor.model.SysLogWithBLOBs;

public interface SysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);

    SysLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    int updateByPrimaryKey(SysLog record);
}