package com.weng.demo.Demo04.no1;

public class Student extends  PerSon{
    /*学校school、学号stuNumber；
    重写工作方法（学生的工作是学习）。*/
    private String school;
    private int stuNumber;

    public void work(){
    System.out.println("学生工作是学习");

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", stuNumber=" + stuNumber +
                '}';
    }


}
