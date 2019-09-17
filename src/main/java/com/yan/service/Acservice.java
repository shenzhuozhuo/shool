package com.yan.service;


import com.yan.entity.Class;

import java.util.List;

public interface Acservice {
    //查询所有
    List<Class> selectAc();
    int deleteByPrimaryKey(Integer cid);
}
