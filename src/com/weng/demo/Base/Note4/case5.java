package com.weng.demo.Base.Note4;

import java.util.Scanner;

public class case5 {
//    输入10个整数存入数组，然后复制到b数组中输出
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []arr=new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i]=sc.nextInt();
    }
    int []b=arr;
    for (int i = 0; i < 10; i++) {
        b[i]=arr[i];
        System.out.println(b[i]);

    }
}
}

