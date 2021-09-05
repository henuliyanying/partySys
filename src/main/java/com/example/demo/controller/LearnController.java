package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.eneities.ReturnTemplate;
import com.example.demo.eneities.Student;
import com.example.demo.eneities.learn;
import com.example.demo.service.impl.LearnServiceImp;
import com.example.demo.service.impl.StudentServiceImp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/learn")
public class LearnController {
    private static int trueCode = 200; //访问成功的编码
    private static int falseCode = 404;//访问失败时返回的代码
    private static String filePath = "static/data";

    @Resource
    private LearnServiceImp learnServiceImp;

    @Resource
    private StudentServiceImp studentServiceImp;
    //根据id获取某一道试题
    @RequestMapping("/getOne")
    public ReturnTemplate getOneLearn(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        System.out.println(jsonObject.getString("userid"));
        Student student = studentServiceImp.getSerialNum(jsonObject.getString("userid"));
        learn learn=learnServiceImp.EgetOneLearn(student.getSerialID());
        List<learn> learnList = new ArrayList<learn>();
        learnList.add(learn);
        if (learn!=null){
            return new ReturnTemplate(200,"OK",null,learnList);
        }else{
            System.out.println("600");
            return new ReturnTemplate(600,"false",null,null);
        }
    }
    @RequestMapping("/getOneByserial")
    public ReturnTemplate getOneLearnByserial(@RequestBody JSONObject jsonObject, HttpServletRequest request){
        learn learn=learnServiceImp.EgetOneLearn(Integer.valueOf(jsonObject.getString("serial")));
        List<learn> learnList = new ArrayList<learn>();
        learnList.add(learn);
        if (learn!=null){
            return new ReturnTemplate(200,"OK",null,learnList);
        }else{
            System.out.println("600");
            return new ReturnTemplate(600,"false",null,null);
        }
    }
}
