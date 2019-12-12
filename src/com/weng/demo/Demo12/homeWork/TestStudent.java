package com.weng.demo.Demo12.homeWork;

public class TestStudent {
    public static void main(String[] args) {
        course c=new course();
        Student stu=new Student();
        stu.stuname.add("张三");
        c.coursename.add("c++");
        c.coursename.add("java");
        c.coursenum.add(9875);
        System.out.println(c.getCoursename(stu.stuname));
    }

}
