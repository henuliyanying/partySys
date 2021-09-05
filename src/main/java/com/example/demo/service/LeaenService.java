package com.example.demo.service;

import com.example.demo.eneities.learn;
import com.example.demo.eneities.question;

import java.util.List;

public interface LeaenService {
    public List<learn> getAllLearn();
    //获取单个试题
    public learn EgetOneLearn(int learnSer);
}
