package com.weng.demo.Demo13.Collectionhomework;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private String password;
    private int grade;

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
        /*  要求：1.学生类,学生编号,学生姓名,学生密码,学生成绩
2.试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
                现在有一个学生进行考试,请在控制台输出这个学生的考试成绩*/
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", grade=" + grade +
                '}';
    }
    public void enter(String name,String password){
        Map map=new HashMap();
        map.put(getName(),getPassword());
        if(map.get(getName())==password){
            System.out.println(getName()+"同学欢迎登陆考试系统");
        }else {
            System.out.println("您输入的账户或密码有误，请重新输入");
        }

    }

}
