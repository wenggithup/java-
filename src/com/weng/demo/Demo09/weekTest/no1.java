package com.weng.demo.Demo09.weekTest;

import java.util.Scanner;

public class no1 {
//    1.输入1个四位数，将其加密后输出。方法是将该数每一位上的数字加9，然后除以10取余，做为该位上的新数字，
//    最后将第1位和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的新数
    static int num,num1,num2,num3,num4,newnum,temp;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        encryption();
    }
    public static void encryption(){
    num1=(num/1000+9)%10;
    num2=(num/100+9)%10;
    num3=(num/10+9)%10;
    num4=(num+9)%10;
    temp=num1;
    num1=num3;
    num3=temp;
    temp=num2;
    num2=num4;
    num4=temp;
    newnum=num1*1000+num2*100+num3*10+num4;
    System.out.println("加密后的数字为："+newnum);
    }
}
