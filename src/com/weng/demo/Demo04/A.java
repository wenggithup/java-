package com.weng.demo.Demo04;

public class A {
    private  double length;
    private  double width;



    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "A{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public  void  mianJi(){
        System.out.println("该长方形的面积为："+length*width);

    }
}
