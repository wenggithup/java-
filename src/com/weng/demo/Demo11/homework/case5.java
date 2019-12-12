package com.weng.demo.Demo11.homework;

public class case5 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("abcd");
        s.append("abcdefghijklmnopqrstuvwxyz");
        s.reverse();
        System.out.println(s);
        s.delete(0,5);
        System.out.println(s);


    }
}
