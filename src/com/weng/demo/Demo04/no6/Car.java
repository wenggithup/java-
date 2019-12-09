package com.weng.demo.Demo04.no6;

public class Car extends Vehicle {
    //小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
    private  int loader;

    public Car(int loader) {
        this.loader = loader;
    }

    public Car() {
        System.out.println("这是小车类无参构造方法");
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}';
    }
}
