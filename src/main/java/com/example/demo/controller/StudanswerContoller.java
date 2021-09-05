package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.eneities.ReturnTemplate;
import com.example.demo.eneities.Student;
import com.example.demo.eneities.studanswer;
import com.example.demo.service.impl.StudAnswerImpService;
import com.example.demo.service.impl.StudentServiceImp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/studAns")
public class StudanswerContoller {
    private static int trueCode = 200; //访问成功的编码
    private static int falseCode = 404;//访问失败时返回的代码
    private static String filePath = "static/data";
    private static int maxQuseA = 187; //A类型题量
    private static int maxQuseB = 331; //B类型题量
    private static int maxQuseC = 354; //C类型题量

    @Resource
    private StudAnswerImpService studAnswerImpService;
    @Resource
    private StudentServiceImp studentServiceImp;

    //插入用户错题记录
    @RequestMapping("/setStuAns")
    public ReturnTemplate setStuAns(@RequestBody JSONObject jsonObject) {
        System.out.println("************进来更新错题");
        String wrong = jsonObject.getString("wrong");
        String[] studnetWrong = wrong.split("@");

        String[] studentT = studnetWrong[1].split("#");

        for (int i=0 ;i<studentT.length-1; i++){
            if (studentT[i].equals(studentT[i+1])){
                studentT[i] = "*";
            }
        }

        List<String> stringList = new ArrayList<String>();
        for (int i=0 ;i<studentT.length; i++){
            if (!studentT[i].equals("*")){
                stringList.add(studentT[i]);
//                System.out.println(studentT[i]);
            }
        }


        List<studanswer> studanswerList = new ArrayList<studanswer>();

        for (int i = 0; i<stringList.size(); i++){
            if (stringList.get(i).equals("")){
                stringList.remove(i);
            }
        }

        for (int i = 0; i < stringList.size() - 1; i++) {
            studanswer studanswer = new studanswer();
            studanswer.setQuesserial(Integer.valueOf(stringList.get(i)));
            studanswer.setUserID(stringList.get(stringList.size()-1));
            studanswerList.add(studanswer);
        }
        for (int i = 0; i < studanswerList.size(); i++) {
            if (studAnswerImpService.selOnequse(studanswerList.get(i)) != null) {

            } else {
                if (studAnswerImpService.insertStudAns(studanswerList.get(i))) {

                } else {
                    System.out.println("600");
                }
            }
        }
        return new ReturnTemplate(200, "错题全部入库！", null, null);
    }
}

