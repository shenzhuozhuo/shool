package com.yan.serviceImpl;

import com.yan.entity.Sc;
import com.yan.mapper.ScMapper;
import com.yan.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScServiceImpl implements ScService {
    @Autowired
    private ScMapper scMapper;
    @Override
    public int insertSelective(Sc record) {
        return scMapper.insertSelective(record);
    }
}
