package com.weng.demo.Demo04;

public class B extends A {
    private  double height;
    private  double length;
    private  double width;

    @java.lang.Override
    public void setLength(double length) {
        this.length= length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

    public void  tiji(){


        System.out.println("该长方形的体积为:"+this.width*this.length*height);

    }
}
