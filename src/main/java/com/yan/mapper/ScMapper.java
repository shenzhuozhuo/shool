package com.yan.mapper;

import com.yan.entity.Sc;

public interface ScMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sc record);

    //添加学生
    int insertSelective(Sc record);

    Sc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);
}