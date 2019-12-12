package com.weng.demo.Demo12.homeWork;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class case2 implements Comparable{

    private int stunum;
    private String name;
    private double grade;

    public case2(int stunum, String name, double grade) {
        this.stunum = stunum;
        this.name = name;
        this.grade = grade;
    }

    public int getStunum() {
        return stunum;
    }

    public void setStunum(int stunum) {
        this.stunum = stunum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        case2 c=(case2) o;
        int num=c.getGrade()>this.getGrade()?1:c.getGrade()<this.getGrade()?-1:c.getStunum()-this.getStunum();
        return num;
    }
}
