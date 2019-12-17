package com.weng.demo.Demo12.homeWork;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class case2Test {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        for (int i = 0,j=10; i < 40; i++) {
            int stunum = i + 180201;
            String name = "同学" + j++;
            double grade = (int) (Math.random() * 50 + 51);
            ts.add(new case2(stunum, name, grade));
        }
            Iterator iterator=ts.iterator();
            while (iterator.hasNext()){
                case2 c=(case2)iterator.next();
                System.out.println("学号："+c.getStunum()+", 姓名："+c.getName()
                +", 成绩"+c.getGrade());

            }


    }

    }

