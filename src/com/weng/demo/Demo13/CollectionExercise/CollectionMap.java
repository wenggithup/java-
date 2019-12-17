package com.weng.demo.Demo13.CollectionExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionMap {
    public static void main(String[] args) {
        String str="asdabdasdasdasdad";
        TreeMap treeMap=new TreeMap();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            Object ob= treeMap.get(c);
            if(ob==null){
                treeMap.put(c,1);
            }
            else {
                Integer j=(Integer)ob;
                j++;
                treeMap.put(c,j++);
            }
        }
        System.out.println(treeMap);
        TreeSet ts=new TreeSet(treeMap.keySet()) ;
        for (Object o:ts) {
            System.out.print(o+"("+treeMap.get(o)+")");

        }

        }
    }


