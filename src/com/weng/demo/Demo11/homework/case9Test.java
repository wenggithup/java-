package com.weng.demo.Demo11.homework;

import com.weng.demo.Demo12.homeWork.Student;

import java.util.ArrayList;
import java.util.List;

public class case9Test {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Student(20,"张三"));
        list.add(new Student(21,"张三"));
        list.add(new Student(22,"张三"));
        for (Object o:list) {
            Student student=(Student)o;
            System.out.println(student.toString());
        }

    }
}
