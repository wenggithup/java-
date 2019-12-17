package com.weng.demo.Demo12.homeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class case5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Character> hs=new HashSet<Character>();
       String s=sc.next();
       char [] c=s.toCharArray();//数组接收
        for (Character d:
             c) {
            hs.add(d);//遍历增加在hs中
        }
        for (char e:
             hs) {
            System.out.print(e);//输出
            
        }
    }
}
