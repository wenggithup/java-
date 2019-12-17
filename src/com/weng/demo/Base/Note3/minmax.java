package com.weng.demo.Base.Note3;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int max=0,min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        max=sc.nextInt();
        min=max;
        for(int i=2;i>0;i++){
            System.out.println("请继续输入数据，输入0结束");
         int num=   sc.nextInt();
         if(num!=0){
             if(max<num){
                 max=num;
             }else {
                 max=max;
             }
             if(min>num){
                 min=num;
             }else {
                 min=min;
             }
         }else {
             break;
         }
        }
        System.out.println(min+"-----"+max);
    }
}

