package com.weng.demo.Demo12.homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class case3 {
    public static void main(String[] args) {
//        .在一个列表中存储以下元素：apple,grape,banana,pear
//        返回集合中的最大的和最小的元素
//        将集合进行排序，并将排序后的结果打印在控制台上
        List arrayList=new ArrayList();
        arrayList.add("apple");
        arrayList.add("grape");
        arrayList.add("banana");
        arrayList.add("pear");
        System.out.println(Collections.max(arrayList));;
        System.out.println(Collections.min(arrayList));;
        Collections.sort(arrayList);
        for (Object s:
             arrayList) {
            System.out.println(s);

        }


    }

}
