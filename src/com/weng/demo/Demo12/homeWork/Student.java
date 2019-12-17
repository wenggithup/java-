package com.weng.demo.Demo12.homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Student {
        private int stuid;
        private String stuname;
        private List list;

    public Student(int stuid, String stuname) {
        this.stuid = stuid;
        this.stuname = stuname;
        list=new ArrayList();
    }

    public Student() {
        list=new ArrayList();
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
    public void addstu(course co){
        list.add(co);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", list=" + list +
                '}';
    }
}