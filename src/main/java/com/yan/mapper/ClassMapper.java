package com.yan.mapper;

import com.yan.entity.Ac;
import com.yan.entity.Class;

import java.util.List;

public interface ClassMapper {
    //查询所有
    List<Class> selectAc();
    int deleteByPrimaryKey(Integer cid);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}