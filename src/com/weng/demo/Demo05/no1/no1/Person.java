package com.weng.demo.Demo05.no1.no1;

public class Person {
    private String name;
    private int id;
    private double pay;

    public Person(String name, int id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public Person() {
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pay=" + pay +
                '}';
    }
}
