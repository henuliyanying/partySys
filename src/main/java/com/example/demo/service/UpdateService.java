package com.example.demo.service;

//对应service层


import com.example.demo.eneities.Student;
import com.example.demo.eneities.question;

import java.util.List;

public interface UpdateService {
    //*******************操作数据库的方法****************************

    //    通过用户id来判断数据库中是否存在该用户
    public boolean checkUser(String userID);
    //    通过用户id来查询该用户的当前做题序号
    public String getSerialNum(String userID);
    //    更新用户的刷题序号
    public boolean updateSerialNum(String userID);

    //*******************操作excel的方法***************************
//    通过用户id来判断数据库中是否存在该用户
    public boolean EcheckUser(String userID);
    //    通过用户id来查询该用户的当前做题序号
    public String EgetSerialNum(String userID);
    //    更新用户的刷题序号
    public boolean EupdateSerialNum(String userID, String serial);
    // 获取所有的试题
    public List<question> getAllQuestion();
    //获取单个试题
    public question EgetOneQuestion(String serial);
    //根据用户id获取用户信息
    public Student EgetUserInf(String userid);

}
