package com.weng.demo;

public class Car {
    private  String size;
    private  String name;
    private  String color;
    private  int date;
    private  String country;

    public Car(){

    }
    public Car(String size,String name,String color,int date,String country){
        size=this.size;
        name=this.name;
        color=this.color;
        date=this.date;
        country=this.country;
    }



    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
