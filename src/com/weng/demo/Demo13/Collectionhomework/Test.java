package com.weng.demo.Demo13.Collectionhomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    /*  要求：1.学生类,学生编号,学生姓名,学生密码,学生成绩
2.试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
                现在有一个学生进行考试,请在控制台输出这个学生的考试成绩*/
    public static void main(String[] args) {
        int num=0;
        Student stu=new Student("张三","1234");
        Student stu1=new Student("李四","12345");
        Student stu2=new Student("王二","12345");
        stu.enter("张三","1234");
        List list=new ArrayList();
        question q=new question("dada","A","B");
        question q1=new question("dada","C","A");
        question q2=new question("dada","C","C");
        question q3=new question("dada","A","D");
        question q4=new question("dada","A","A");
        list.add(q);
        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);
        for (Object ob: list) {
            question s=(question)ob;
            if(s.getOption().equals(s.getAnswer())){
                num=num+10;
            }else {
                num=num+0;
            }
        }
        System.out.println(num);


    }
}
