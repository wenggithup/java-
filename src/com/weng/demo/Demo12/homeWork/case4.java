package com.weng.demo.Demo12.homeWork;

import java.util.HashSet;
import java.util.Set;

public class case4 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet =new HashSet<>();
        while (hashSet.size()<10){
            hashSet.add((int)(Math.random()*20+1));
        }
        for (Object obj:
             hashSet) {
            System.out.println(obj);

        }



        }




}
