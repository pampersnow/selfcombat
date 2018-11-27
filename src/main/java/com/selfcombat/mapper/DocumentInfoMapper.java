package com.selfcombat.mapper;

import com.selfcombat.domain.DocumentInfo;

public interface DocumentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocumentInfo record);

    int insertSelective(DocumentInfo record);

    DocumentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocumentInfo record);

    int updateByPrimaryKey(DocumentInfo record);
}