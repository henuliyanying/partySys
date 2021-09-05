package com.example.demo.service.impl;

import com.example.demo.eneities.studanswer;
import com.example.demo.mapper.StudAnswerMapper;
import com.example.demo.service.StudAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudAnswerImpService implements StudAnswerService {

    @Autowired
    private StudAnswerMapper studAnswerMapper;

    @Override
    public List<studanswer> getAllquseID(int userID) {
        List<studanswer> studanswerList = studAnswerMapper.getAllquseID(userID);
        return studanswerList;
    }

    @Override
    public boolean insertStudAns(studanswer studanswer) {
        return studAnswerMapper.insertStudAns(studanswer);
    }

    @Override
    public studanswer selOnequse(studanswer studanswer) {
        return studAnswerMapper.selOnequse(studanswer);
    }
}
