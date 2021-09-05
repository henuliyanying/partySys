package com.example.demo.eneities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Wen Bo Zhang
 * @Date: 2021/03/10/8:31
 * @Description:
 */
//本类是专门用于获取从数据库中得到的数据信息，比如文件名称，文件路径，文件类型
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String userID;
    private String name;
    private int serialID;
    private int answerSum;
    private int ansRiSum;
    private int quesserialA;
    private int quesserialB;
    private int quesserialC;

}
