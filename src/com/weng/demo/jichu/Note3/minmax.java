package com.weng.demo.jichu.Note3;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);

        int min=2147483647;int max=-2147483648;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            }else{
                break;
            }


        }
        System.out.println("最大值为" + max+"最小值为："+min);

    }
}

