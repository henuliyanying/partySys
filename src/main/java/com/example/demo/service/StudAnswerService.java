package com.example.demo.service;

import com.example.demo.eneities.studanswer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudAnswerService {
    //根据用户id获取用户所有错题记录
    public List<studanswer> getAllquseID(int userID);
    //插入用户错题
    public boolean insertStudAns(studanswer studanswer);
    //判断是否重复
    public studanswer selOnequse(studanswer studanswer);
}
