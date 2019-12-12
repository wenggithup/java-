package com.weng.demo.Demo09.weekTest;

import java.util.Scanner;

public class no1 {
//    1.输入1个四位数，将其加密后输出。方法是将该数每一位上的数字加9，然后除以10取余，做为该位上的新数字，
//    最后将第1位和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的新数
    public static void main(String[] args) {
        no1 a=new no1();
        a.encryption();
    }
    public  void encryption() {
        Scanner sc=new Scanner(System.in);
        int [] a=new int[10];
        int num=sc.nextInt();
        for (int i=0;i<4;i++){
            a[i]=(num%10+9)%10;
            num=num/10;
        }
        System.out.println(a[1]*1000+a[0]*100+a[3]*10+a[2]);
    }
}
