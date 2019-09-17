package com.yan.mapper;

import com.yan.entity.Alecturer;

import java.util.List;

public interface AlecturerMapper {
    //查询所有的讲师
    List<Alecturer> selectAle();
    int deleteByPrimaryKey(Integer aid);

    int insert(Alecturer record);

    int insertSelective(Alecturer record);

    Alecturer selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Alecturer record);

    int updateByPrimaryKey(Alecturer record);
}