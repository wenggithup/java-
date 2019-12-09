package com.weng.demo.Demo04.no6;

public class Truck extends Car{
//    卡车类Truck是Car类的子类，其中包含的属性有载重量yload
    private  double yload;

    public Truck(double yload) {
        this.yload = yload;
    }


    public Truck() {
        System.out.println("这是卡车类中的无参构造方法");
    }

    public double getYload() {
        return yload;
    }

    public void setYload(double yload) {
        this.yload = yload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "yload=" + yload +
                '}';
    }
}
