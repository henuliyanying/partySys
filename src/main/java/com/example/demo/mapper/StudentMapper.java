package com.example.demo.mapper;

import com.example.demo.eneities.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    //    通过用户id来判断数据库中是否存在该用户
    boolean checkUser(String userID);
    //    通过用户id来查询该用户的所有信息
    Student getSerialNum(String userID);
    //    更新用户的刷题序号
    boolean updateSerialNum(Student student);
    // 根据用户id更新其刷题总量
    boolean updateAnswerSum(Student student);
    // 根据用户id更新其总的正确题量
    boolean updateAnsRiSum(Student student);
    // 根据用户id更新quesserialA。quesserialB，quesserialC
    boolean updateQuesserial(Student student);
    // 更新全部用信息
    boolean updUser(Student student);
    //获取所有用户信息
    List<Student> getAll();
}
