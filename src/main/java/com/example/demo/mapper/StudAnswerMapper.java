package com.example.demo.mapper;

import com.example.demo.eneities.studanswer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudAnswerMapper {
    //根据用户id获取用户所有错题记录
    List<studanswer> getAllquseID(int userID);
    //插入用户错题
    boolean insertStudAns(studanswer studanswer);
    //判断是否重复
    studanswer selOnequse(studanswer studanswer);
}
