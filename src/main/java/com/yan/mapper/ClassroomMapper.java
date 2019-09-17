package com.yan.mapper;

import com.yan.entity.Classroom;

import java.util.List;

public interface ClassroomMapper {
    //查询教室
    List<Classroom> selectCla();
    int deleteByPrimaryKey(Integer clid);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    Classroom selectByPrimaryKey(Integer clid);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);
}