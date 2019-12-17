package com.weng.demo.Demo16.weekTest;

import apple.laf.JRSUIUtils;

import java.util.*;

public class note3 {
    public static void main(String[] args) {
        HashMap  map=new HashMap();
        HashMap  map1=new HashMap();
        HashMap  map2=new HashMap();
        map.put("周瑜","小乔");
        map.put("吕布","貂蝉");
        map1.put("杨过","小龙女");
        map1.put("郭靖","黄蓉");
        map2.put("林平之","岳灵珊");
        map2.put("令狐冲","任盈盈");//把元素放入HashMap集合中，由于本身存在排序，所以输出固定。
        ArrayList  arrayList=new ArrayList();
        arrayList.add(map);
        arrayList.add(map1);
        arrayList.add(map2);//将HashMap元素放入集合中
        for (Object map3:arrayList) {//遍历arrayList集合中的数组元素，用map3接收
                HashMap hashMap=(HashMap)map3;//将mp3强转为HashMap集合
            for (Object key:hashMap.keySet()) {//用key对象来接收hashmap中所有的键元素
                System.out.println(key+"----"+hashMap.get(key));

            }

        }



    }
    }

