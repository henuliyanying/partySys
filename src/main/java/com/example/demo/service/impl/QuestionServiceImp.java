package com.example.demo.service.impl;

import com.example.demo.eneities.question;
import com.example.demo.mapper.QuestionMapper;
import com.example.demo.service.QusetionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QusetionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<question> getAllQuestion() {
        List<question> questionList = questionMapper.getAllQuestion();
        return questionList;
    }

    @Override
    public question EgetOneQuestion(int quesserial) {
        question question = questionMapper.EgetOneQuestion(quesserial);
        return question;
    }
}
