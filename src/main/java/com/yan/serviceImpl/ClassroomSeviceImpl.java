package com.yan.serviceImpl;

import com.yan.entity.Classroom;
import com.yan.mapper.ClassMapper;
import com.yan.mapper.ClassroomMapper;
import com.yan.service.ClassroomSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ClassroomSeviceImpl implements ClassroomSevice {
    @Autowired
    private ClassroomMapper classroomMapper;
    @Override
    public List<Classroom> selectCla() {
        return classroomMapper.selectCla();
    }
}
