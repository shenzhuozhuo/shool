package com.yan.mapper;

import com.yan.entity.Students;

import java.util.List;

public interface StudentsMapper {

    //查询所有的学生
    List<Students> selectStu();
    int deleteByPrimaryKey(Integer sid);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}