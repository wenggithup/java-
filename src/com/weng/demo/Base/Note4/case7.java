package com.weng.demo.Base.Note4;

import java.util.Scanner;

public class case7 {
    //定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。
    public static void main(String[] args) {
        int []arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("请输入需要查找的数");
       int num= sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if(arr[i]==num){
                System.out.println("数据存在，下标为："+i);
            }

            }
        }

    }



