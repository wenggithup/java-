package com.weng.demo.Demo12.homeWork.Collection;

import com.weng.demo.Demo12.homeWork.Student;

import java.util.Set;
import java.util.TreeSet;

public class case2Test {
    // 2.某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，给出所有同学
    // 的成绩（可随机产生，范围为 50-100），请编写程序将本班各位同学成绩从高往低排序打印输出，
    //注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
    public static void main(String[] args) {
        Set set=new TreeSet<>();
        for (int i = 0; i < 40; i++) {
            int id=i+180201;
            String name="同学"+(i+10);
            int score =(int)(Math.random()*50+51);
            set.add(new case2(id,name,score));
        }
        for (Object object:set) {
            case2 c=(case2)object;
            System.out.println("学号:"+c.getId()+"姓名："+c.getName()+"成绩"+c.getScore());
        }

    }
}
