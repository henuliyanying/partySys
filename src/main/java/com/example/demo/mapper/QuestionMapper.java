package com.example.demo.mapper;

import com.example.demo.eneities.question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QuestionMapper {
    List<question> getAllQuestion();
    //获取单个试题
    question EgetOneQuestion(int quesserial);
}
