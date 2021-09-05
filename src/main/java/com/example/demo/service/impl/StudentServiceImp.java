package com.example.demo.service.impl;

import com.example.demo.eneities.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public boolean checkUser(String userID) {
        return studentMapper.checkUser(userID);
    }

    @Override
    public Student getSerialNum(String userID) {
        return studentMapper.getSerialNum(userID);
    }

    @Override
    public boolean updateSerialNum(Student student) {
        return studentMapper.updateSerialNum(student);
    }

    @Override
    public boolean updateAnswerSum(Student student) {
        return studentMapper.updateAnswerSum(student);
    }

    @Override
    public boolean updateAnsRiSum(Student student) {
        return studentMapper.updateAnsRiSum(student);
    }

    @Override
    public boolean updateQuesserial(Student student) {
        return studentMapper.updateQuesserial(student);
    }

    @Override
    public boolean updUser(Student student) {
        return studentMapper.updUser(student);
    }

    @Override
    public List<Student> getAll() {
        List <Student> studentList = new ArrayList<Student>();
        studentList=studentMapper.getAll();
        return studentList;
    }
}
