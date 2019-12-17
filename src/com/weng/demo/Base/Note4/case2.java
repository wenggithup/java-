package com.weng.demo.Base.Note4;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum1=0,sum2=0,sum3=0;
        double average1,average2,average3;
        for (int i = 0; i <10 ; i++) {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int num3=sc.nextInt();
            sum1=num1+sum1;
            sum2=num2+sum2;
            sum3=num3+sum3;
        }
        average1=sum1/10;
        average2=sum2/10;
        average3=sum3/10;
        System.out.println("一班总分成绩："+sum1+"一班平均分成绩"+average1);

    }
}
