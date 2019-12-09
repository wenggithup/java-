package com.weng.demo.jichu;

import java.util.Scanner;

public class note3 {
    public static void main(String[] args) {
        int [] arr=new int[5];
        int sum =0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("五个数据总和为："+sum);
    }

}
