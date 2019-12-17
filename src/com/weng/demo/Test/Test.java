package com.weng.demo.Test;

public class Test {
    public static void main(String[] args) {
        System.out.println(method());;
    }
    public static int method(){
        int x = 5;
    try {
        return x;
    }catch (Exception e){
        x=6;
        return x;

    }finally {
        x=7;
        return x;
    }

    }
}
