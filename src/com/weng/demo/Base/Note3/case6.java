package com.weng.demo.Base.Note3;

import java.util.Scanner;

public class case6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[30];
        int count=sc.nextInt();
        int count1=0;
        for(int i=0;i<10;i++){
        int m=(int)( Math.random()*30+1);
            System.out.print(m+",");
        if(m==count){
            count1++;
        }

        }
        System.out.println("");
        System.out.println(count1);
    }
}
