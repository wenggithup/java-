package com.weng.demo.jichu.Note3;

import java.util.Scanner;

public class case7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] num1=new int[20];
        while (num>0){
            for(int i=0;i<3;i++) {
                num1[i]=num%10;
                System.out.println(num1[i]);
                num =num/10;

            }

        }
        System.out.println(num1[0]*100+num1[1]*10+num1[2]);
    }

}
