package com.yan.serviceImpl;

import com.yan.entity.Alecturer;
import com.yan.mapper.AlecturerMapper;
import com.yan.service.AlecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AlecturerServiceImpl implements AlecturerService {
    @Autowired
    private AlecturerMapper alecturerMapper;
    //查询所有的讲师
    @Override
    public List<Alecturer> selectAle() {
        return alecturerMapper.selectAle();
    }
}
