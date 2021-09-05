package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.eneities.ReturnTemplate;
import com.example.demo.eneities.Student;
import com.example.demo.eneities.question;
import com.example.demo.service.impl.QuestionServiceImp;
import com.example.demo.service.impl.StudentServiceImp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private static int trueCode=200; //访问成功的编码
    private static int falseCode=404;//访问失败时返回的代码
    private static String filePath = "static/data";

    private static int maxQuseA = 187; //A类型题量
    private static int maxQuseB = 331; //B类型题量
    private static int maxQuseC = 354; //C类型题量

    @Resource
    private QuestionServiceImp questionServiceImp;
    @Resource
    private StudentServiceImp studentServiceImp;

    //根据id获取测试题（判断）
    @RequestMapping("/getQues")
    public ReturnTemplate EcheckUser(@RequestBody JSONObject jsonObject){
        Student student = studentServiceImp.getSerialNum(jsonObject.getString("userID"));
        List<question> questionList = new ArrayList<question>();
        for (int i=0;i<5;i++){
            if (maxQuseA>=(student.getQuesserialA()+i)){
                question question = questionServiceImp.EgetOneQuestion(student.getQuesserialA()+i);
                questionList.add(question);
            }else {
                question question = questionServiceImp.EgetOneQuestion(1);
                student.setQuesserialA(1);
                questionList.add(question);
            }
        }
        for (int i=0;i<4;i++){
            if (maxQuseB>=(student.getQuesserialB()+i)){
                question question = questionServiceImp.EgetOneQuestion(student.getQuesserialB()+i);
                questionList.add(question);
            }else {
                question question = questionServiceImp.EgetOneQuestion(maxQuseA+1);
                student.setQuesserialB(maxQuseA+1);
                questionList.add(question);
            }
        }
        if (maxQuseC>=(student.getQuesserialC())){
            question question = questionServiceImp.EgetOneQuestion(student.getQuesserialC());
            questionList.add(question);
        }else {
            question question = questionServiceImp.EgetOneQuestion(maxQuseB+1);
            questionList.add(question);
        }
        return new ReturnTemplate(200,"OK",null,questionList);
    }
}
