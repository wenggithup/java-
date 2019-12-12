package com.weng.demo.Demo11.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class case2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入出生日期，格式：yyyy-MM-dd");
        String birthday=sc.next();
        SimpleDateFormat by=new SimpleDateFormat("yyyy-MM-dd");
        Date brithdaytime =by.parse(birthday);
        double br=brithdaytime.getTime();
        double tody=System.currentTimeMillis();
        double sum=tody-br;
        System.out.println("你已经出生了"+sum/1000/60/60/24+"天");
    }
}
