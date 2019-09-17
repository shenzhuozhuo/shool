package com.yan.serviceImpl;

import com.yan.entity.Students;
import com.yan.mapper.StudentsMapper;
import com.yan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentsMapper studentsMapper;
    @Override
    public List<Students> selectStu() {
        return studentsMapper.selectStu();
    }
}
