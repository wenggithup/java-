package com.weng.demo.Demo16.weekTest;

import java.util.HashMap;
import java.util.Map;

public class note1 {
    public static void main(String[] args) {
        String str="123,456,789,123,456";
//        String s= str.substring(0,3);
//        String s1=str.substring(4,7);
//        String s2=str.substring(8,11);
//        String s3=str.substring(12,15);
//        String s4=str.substring(16,19);
//        String [] str1={s,s1,s2,s3,s4};
        String [] str1=str.split(",");//调用String中的split方法。
        Map map=new HashMap();
        for (int i = 0; i < 5; i++) {
            Object ob=map.get(str1[i]);//判断值属性，为空则为0，如果不为空，则得到值属性。
            if(ob==null){//判断值是不是空，如果为空，则添加进map中
                map.put(str1[i],1);
            }else {
                Integer j=(Integer)ob;//初始值为1
                j++;
                map.put(str1[i],j++);
            }
        }
        System.out.println(map);
       // String s="A";
       // String s1=s+"A"+"B";//问题，一共生成了几个对象
    }
}
