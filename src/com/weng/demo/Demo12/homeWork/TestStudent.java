package com.weng.demo.Demo12.homeWork;

public class TestStudent {
    public static void main(String[] args) {
        course cs=new course(9528,"c++");
        course cs1=new course(9529,"java");
        course cs2=new course(9521,"js");
        course cs3=new course(9522,"py");
        course cs4=new course(9523,"cdd");
        course cs5=new course(9524,"ooo");

        Student student=new Student(01,"张三");
        Student student1=new Student(02,"张三1");
        Student student2=new Student(03,"张三2");
        student.addstu(cs);
        student.addstu(cs1);
        student1.addstu(cs2);
        student1.addstu(cs3);
        student2.addstu(cs4);
        student2.addstu(cs5);
        
        case2Tool.list.add(student);
        case2Tool.list.add(student1);
        case2Tool.list.add(student2);
        for (Object ob: case2Tool.list) {
            Student stu=(Student)ob;
            System.out.println(stu.toString());
        }



    }

}
