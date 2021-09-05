package com.example.demo.eneities;

import java.util.List;

//这个类是专门用于返回信息格式的模板
public class ReturnTemplate<E> {
    private int code;  //返回值代码，200代表 成功；404代表失败
    private String message; //返回一些具体的说明性信息
    private String serial;//返回一些泛型类型的数据比如可以是一个实体类型
    private List<question> list;

    public ReturnTemplate(int code, String message, String serial,List<question> list) {
        this.code = code;
        this.message = message;
        this.serial = serial;
        this.list=list;
    }

    public List<question> getList() {
        return list;
    }

    public void setList(List<question> list) {
        this.list = list;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    //本方法是专门用于外部类中通过return new方式创建返回据
    public static  ReturnTemplate getRetruenTemplate(ReturnTemplate returnTemplate){
        return returnTemplate;
    }
}
