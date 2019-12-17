package com.weng.demo.Demo12.homeWork.Collection;

public class case2 implements Comparable {
   // 2.某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，给出所有同学
    // 的成绩（可随机产生，范围为 50-100），请编写程序将本班各位同学成绩从高往低排序打印输出，
    //注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
    private int id;
    private String name;
    private double score;

    public case2(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public case2() {
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        case2 c=(case2)o;
        int num=c.getScore()>getScore()?1:c.getScore()<getScore()?-1:getId()-c.getId();
        return num;
    }
}
