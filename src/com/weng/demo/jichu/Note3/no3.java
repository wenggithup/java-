package com.weng.demo.jichu.Note3;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int max =0;
        int min =0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            for(int j=1;j<4-i;j++) {
                if (arr[j] >arr[j+1]) {
                    max=arr[j];
                } else {
                    max = max;
                }

            }
                }
//                if(arr[i]>arr[j]) {
//                    arr[i]=arr[j];
//                    min=arr[i];
//                }



//



        System.out.println("最大值为" + max);
        System.out.println("最小值为" + min);

        }

    }
