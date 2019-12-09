package com.weng.demo.Demo04.no1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test1 {
    public static void main(String[] args) {
        PerSon person=new PerSon();
        person.setAge(15);
        person.toString();
        person.setGender("男");
        person.setName("张三");
        person.setNationlity("中国");
        System.out.println("姓名:"+person.getName()+"   性别:"+person.getGender()+"  国籍:"+person.getNationlity());
        person.work();
        Student student=new Student();
        student.setSchool("北大");
        student.setStuNumber(88);
        System.out.println("学校:"+student.getSchool()+"   学号："+student.getStuNumber());
        student.work();
        Worker worker=new Worker();
        worker.setUnit("家里蹲");
        worker.setWorkAge(5);
        worker.work();
        System.out.println("职业："+worker.getUnit()+"   工龄:"+worker.getWorkAge());
    }
}
