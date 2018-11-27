package com.selfcombat.mapper;

import com.selfcombat.domain.DeptInfo;

public interface DeptInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeptInfo record);

    int insertSelective(DeptInfo record);

    DeptInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeptInfo record);

    int updateByPrimaryKey(DeptInfo record);
}