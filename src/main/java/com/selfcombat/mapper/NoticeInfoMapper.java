package com.selfcombat.mapper;

import com.selfcombat.domain.NoticeInfo;

public interface NoticeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoticeInfo record);

    int insertSelective(NoticeInfo record);

    NoticeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoticeInfo record);

    int updateByPrimaryKeyWithBLOBs(NoticeInfo record);

    int updateByPrimaryKey(NoticeInfo record);
}