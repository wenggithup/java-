package com.weng.demo.Demo04.no1;

public class StudentLeader extends Student {
    /*4.根据学生类，创建一个学生干部类 StudentLeader
    增加属性：
    职务job；
    增加方法：开会meeting。*/
    private Student job;

    public Student getJob() {
        return job;
    }

    public void setJob(Student job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "StudentLeader{" +
                "job=" + job +
                '}';
    }
}
