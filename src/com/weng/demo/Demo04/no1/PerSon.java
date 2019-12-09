package com.weng.demo.Demo04.no1;

public class PerSon {
    /*姓名name、性别gender、年龄age、国籍nationality；
    方法：吃饭eat、睡觉sleep，工作work。*/
    private String name;
    private String gender;
    private int age;
    private String nationlity;
    public   void eat(){
        System.out.println("这是吃饭");
    }
    public  void sleep(){
        System.out.println("这是睡觉");
    }
    public void work(){
        System.out.println("这是工作");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }



    public String getNationlity() {
        return nationlity;
    }

    public void setNationlity(String nationlity) {
        this.nationlity = nationlity;
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationlity='" + nationlity + '\'' +
                '}';
    }
}

