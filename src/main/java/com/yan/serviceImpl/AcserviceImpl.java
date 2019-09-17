package com.yan.serviceImpl;

import com.yan.entity.Class;
import com.yan.mapper.ClassMapper;
import com.yan.service.Acservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AcserviceImpl implements Acservice {
    @Autowired
    private  ClassMapper classMapper;
    //查询数据


    @Override
    public List<Class> selectAc() {
        return classMapper.selectAc();
    }

    //删除数据
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return classMapper.deleteByPrimaryKey(id);
    }

}
