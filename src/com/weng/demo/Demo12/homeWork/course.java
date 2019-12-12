package com.weng.demo.Demo12.homeWork;

import java.util.ArrayList;

public class course {
    ArrayList coursenum =new ArrayList();
    ArrayList coursename=new ArrayList();
    Student stu=new Student();

    public ArrayList getCoursenum(String stuname) {
        return coursenum;
    }

    public void setCoursenum(ArrayList coursenum) {
        this.coursenum = coursenum;
    }

    public ArrayList getCoursename(ArrayList stuname) {
        if(stuname==stu.getStuname()) {
            return coursename;
        }
        return stuname;
    }

    public void setCoursename(ArrayList coursename) {
        this.coursename = coursename;
    }


}
