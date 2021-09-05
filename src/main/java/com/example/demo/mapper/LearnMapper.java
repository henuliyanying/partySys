package com.example.demo.mapper;

import com.example.demo.eneities.learn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LearnMapper {
    List<learn> getAllLearn();
    //获取单个试题
    learn EgetOneLearn(int learnSer);
}
