package com.weng.demo.Demo11.homework;

import java.util.Random;
import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数据取值范围");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        if(a1<a2) {
            int random = new Random().nextInt(a2 - a1);
            System.out.println(random + a1);
        }else {
            int random = new Random().nextInt(a1 - a2);
            System.out.println(random + a2);
        }

    }

}
