package com.example.demo.eneities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Wen Bo Zhang
 * @Date: 2021/03/10/9:44
 * @Description:
 */

//本类的作用是一个实体类，用来存储试题的

@Data
@AllArgsConstructor
@NoArgsConstructor
public class question {
    private int quesserial;
    private String quesStem;
    private String quesAns;
    private String quesSource;
}
