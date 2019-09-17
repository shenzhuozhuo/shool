package com.yan.mapper;

import com.yan.entity.Ac;


public interface AcMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Ac record);


    int insertSelective(Ac record);

    Ac selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ac record);

    int updateByPrimaryKey(Ac record);
}