package com.weng.demo.Base.Note4;

import java.util.Scanner;

public class case6 {
    //    声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分

    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        int max=0,min=2000,average=0,sum=0;
        for (int i = 0; i <8 ; i++) {
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }if(min>arr[i]){
                min=arr[i];
            }
            sum=arr[i]+sum;
        }
        System.out.println("max"+max+"---"+"min"+min+"----"+"average"+sum/8);
    }
}


