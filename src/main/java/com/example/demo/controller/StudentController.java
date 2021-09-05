package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.eneities.ReturnTemplate;
import com.example.demo.eneities.Student;
import com.example.demo.service.impl.StudentServiceImp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class StudentController {
    private static int trueCode=200; //访问成功的编码
    private static int falseCode=404;//访问失败时返回的代码
    private static String filePath = "static/data";
    private static int maxQuseA = 187; //A类型题量
    private static int maxQuseB = 331; //B类型题量
    private static int maxQuseC = 354; //C类型题量
    @Resource
    private StudentServiceImp studentService;

    //判断登录
    @RequestMapping("/check")
    public ReturnTemplate EcheckUser(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        System.out.println("****************进来了");
        System.out.println("****************"+jsonObject.getString("userID"));

        if(studentService.checkUser(jsonObject.getString("userID"))){
            request.getSession().setAttribute("userID",jsonObject.getString("userID"));

            System.out.println("200");
            return new ReturnTemplate(200,"OK",null,null);
        }else{
            System.out.println("600");
            return new ReturnTemplate(600,"false",null,null);
        }
    }
    //根据id获取用户信息
    @RequestMapping("/getuser")
    public ReturnTemplate getUser(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        Student student = studentService.getSerialNum(jsonObject.getString("userID"));
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        return new ReturnTemplate(200,"OK",null,studentList);
    }
    //根据id修改用户serialID
    @RequestMapping("/setserialID")
    public ReturnTemplate setSerialID(@RequestBody JSONObject jsonObject){
        System.out.println(jsonObject.getString("serial")+ jsonObject.getString("userid"));
        Student student = studentService.getSerialNum(jsonObject.getString("userid"));
        student.setSerialID(Integer.valueOf(jsonObject.getString("serial")));
        if (studentService.updateSerialNum(student)){
            System.out.println("200"+student.getUserID()+"更新了"+student.getSerialID());
            return new ReturnTemplate(200,"OK",null,null);
        }else {
            System.out.println("600"+student.getUserID()+"更新失败---"+student.getSerialID());
            return new ReturnTemplate(600,"false",null,null);
        }
    }
    //根据id修改answerSun
    @RequestMapping("/setAnswerID")
    public ReturnTemplate setAnswerID(Student student){
        if (studentService.updateAnswerSum(student)){
            System.out.println("200"+student.getUserID()+"更新了"+student.getAnswerSum());
            return new ReturnTemplate(200,"OK",null,null);
        }else {
            System.out.println("600"+student.getUserID()+"更新失败---"+student.getAnswerSum());
            return new ReturnTemplate(600,"false",null,null);
        }
    }
    //根据id修改ansRiSum
    @RequestMapping("/setAnsRiSum")
    public ReturnTemplate setAnsRiSum(Student student){
        if (studentService.updateAnsRiSum(student)){
            System.out.println("200"+student.getUserID()+"更新了"+student.getAnsRiSum());
            return new ReturnTemplate(200,"OK",null,null);
        }else {
            System.out.println("600"+student.getUserID()+"更新失败---"+student.getAnsRiSum());
            return new ReturnTemplate(600,"false",null,null);
        }
    }
    //根据id修改quesserialA。quesserialB，quesserialC
    @RequestMapping("/setQuesserial")
    public ReturnTemplate setQuesserial(Student student){
        if (student.getQuesserialA()+5>maxQuseA){
            student.setQuesserialA(student.getQuesserialA()+6-maxQuseA);
        }else {
            student.setQuesserialA(student.getQuesserialA()+5);
        }
        if (student.getQuesserialB()+4>maxQuseB){
            student.setQuesserialB(student.getQuesserialB()+5-maxQuseB);
        }else {
            student.setQuesserialB(student.getQuesserialB()+4);
        }
        if (student.getQuesserialC()+1>maxQuseC){
            student.setQuesserialC(maxQuseB+1);
        }else {
            student.setQuesserialC(student.getQuesserialC()+1);
        }
        if (studentService.updateQuesserial(student)){
            System.out.println("200"+student.getUserID()+"更新了"+student.getQuesserialA()+student.getQuesserialB()+student.getQuesserialC());
            return new ReturnTemplate(200,"OK",null,null);
        }else {
            System.out.println("600"+student.getUserID()+"更新失败---"+student.getQuesserialA()+student.getQuesserialB()+student.getQuesserialC());
            return new ReturnTemplate(600,"false",null,null);
        }
    }
    @RequestMapping("/updUser")
    public ReturnTemplate updUser(@RequestBody JSONObject jsonObject) {
        Student student = studentService.getSerialNum(jsonObject.getString("userID"));
        System.out.println("************UserID"+jsonObject.getString("userID"));
        System.out.println("************right"+jsonObject.getString("right"));
        student.setAnswerSum(student.getAnswerSum()+10);
        student.setAnsRiSum(student.getAnsRiSum()+Integer.valueOf(jsonObject.getString("right")));
        System.out.println(student);
        if ((student.getQuesserialA()+5)>maxQuseA){
            student.setQuesserialA(student.getQuesserialA()+5-maxQuseA);
        }else {
            student.setQuesserialA(student.getQuesserialA()+5);
        }
        if ((student.getQuesserialB()+4)>maxQuseB){
            student.setQuesserialB(student.getQuesserialB()+4-maxQuseB+maxQuseA);
        }else {
            student.setQuesserialB(student.getQuesserialB()+4);
        }
        if ((student.getQuesserialC()+1)>maxQuseC){
            student.setQuesserialC(maxQuseB+1);
        }else {
            student.setQuesserialC(student.getQuesserialC()+1);
        }
        System.out.println(student);
        if (studentService.updUser(student)){
            return new ReturnTemplate(200, "用户信息更新成功！", null, null);
        }else {
            return new ReturnTemplate(600, "用户信息更新失败！", null, null);
        }
    }

    @RequestMapping("/getAvgTop")
    public ReturnTemplate getAll() {
        List<Student> studentList = studentService.getAll();
        List<Double> doubles = new ArrayList<Double>();
        List<Integer> integers = new ArrayList<Integer>();
        for (int i=0; i<studentList.size()-2; i++){
            if (studentList.get(i).getAnswerSum()!=0){
                doubles.add(((double) studentList.get(i).getAnsRiSum())/((double) studentList.get(i).getAnswerSum())*10.0);
                integers.add(studentList.get(i).getAnsRiSum());
            }else {
                doubles.add(0.0);
                integers.add(studentList.get(i).getAnsRiSum());
            }
        }
        //对doubles升序排序
        Collections.sort(doubles);
        //对doubles反序
        Collections.reverse(doubles);
        return new ReturnTemplate(200, "", null, doubles);
    }

    @RequestMapping("/getSumTop")
    public ReturnTemplate getAll2() {
        List<Student> studentList = studentService.getAll();
        List<Integer> integers = new ArrayList<Integer>();
        for (int i=0; i<studentList.size()-2; i++){
            integers.add(studentList.get(i).getAnsRiSum());
        }
        //对doubles升序排序
        Collections.sort(integers);
        //对doubles反序
        Collections.reverse(integers);
        return new ReturnTemplate(200, "", null, integers);
    }
}
