package com.example.demo.service;

import com.example.demo.eneities.question;

import java.util.List;

public interface QusetionService {
    public List<question> getAllQuestion();
    //获取单个试题
    public question EgetOneQuestion(int quesserial);
}
