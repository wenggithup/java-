package com.weng.demo.Demo04.no6;

public class TestCar {
    public static void main(String args[]){/*
            Vehicle vehicle=new Vehicle();//测试汽车类无参构造方法模块
            Car car=new Car();//测试子类小轿车无参构造方法模块
            Truck truck=new Truck();//测试子类卡车类无参构造方法模块
            Vehicle vehicle1=new Vehicle(4,20.00);//测试汽车类有参构造方法模块
            System.out.println("汽车的轮子数量为："+vehicle1.getWheels()+"   汽车的重量为:"+vehicle1.getWeight());*/
            Car car1=new Car(10);
            System.out.println("小车的载人数量为："+car1.getLoader());
            Truck truck1=new Truck(1000.00);
            System.out.println("卡车的重量为："+truck1.getYload());
    }
}
