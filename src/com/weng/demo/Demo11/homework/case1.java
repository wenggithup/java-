package com.weng.demo.Demo11.homework;

public class case1 {
    public static void main(String[] args) {
        String s1="abcdefg";
        System.out.println(s1.hashCode());
        StringBuffer s2=new StringBuffer("abcdefg");
        String s3=s1.replace("a","A");//把第一个遇到的小a替换成A
        System.out.println(s1.hashCode());//获取前后的哈希地址
        System.out.println(s1+","+s3);//
       StringBuffer s4= s2.append("dsddad");//在字符串尾部插入dsddad；
        System.out.println(s2+","+s4);
    }


}
