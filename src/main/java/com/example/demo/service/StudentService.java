package com.example.demo.service;

import com.example.demo.eneities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    //    通过用户id来判断数据库中是否存在该用户
    public boolean checkUser(String userID);
    //    通过用户id来查询该用户的所有信息
    public Student getSerialNum(String userID);
    //    更新用户的刷题序号
    public boolean updateSerialNum(Student student);
    // 根据用户id更新其刷题总量
    public boolean updateAnswerSum(Student student);
    // 根据用户id更新其总的正确题量
    public boolean updateAnsRiSum(Student student);
    // 根据用户id更新quesserialA。quesserialB，quesserialC
    public boolean updateQuesserial(Student student);
    // 更新全部用信息
    public boolean updUser(Student student);
    //获取所有用户信息
    public List<Student> getAll();
}
