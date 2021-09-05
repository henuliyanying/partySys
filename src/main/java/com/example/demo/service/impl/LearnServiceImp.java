package com.example.demo.service.impl;

import com.example.demo.eneities.learn;
import com.example.demo.mapper.LearnMapper;
import com.example.demo.service.LeaenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnServiceImp implements LeaenService {
    @Autowired
    private LearnMapper learnMapper;
    @Override
    public List<learn> getAllLearn() {
        List<learn> learnList = learnMapper.getAllLearn();
        return learnList;
    }

    @Override
    public learn EgetOneLearn(int learnSer) {
        learn learn = learnMapper.EgetOneLearn(learnSer);
        return learn;
    }
}
