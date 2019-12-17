package com.weng.demo.Base.Note4;

import java.util.HashMap;
import java.util.Map;

public class case8 {
//      有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
//0  1  2  3  4  5  6  7  8  9
public static void main(String[] args) {
    int []arr=new int[30];
    for (int i = 0; i <30 ; i++) {
        arr[i]=(int)(Math.random()*10);
    }
    Map map=new HashMap();
    for (int i = 0; i < 30; i++) {
       Integer s=(Integer) map.get(arr[i]);
    if(map.get(arr[i])==null) {
        map.put(arr[i],1);
    }else {
        s++;
        map.put(arr[i],s++);
    }
    }

    System.out.println(map);



/*    int count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
    for(int i=0;i<30;i++){
        if(arr[i]==0){
            count++;
        }
        if(arr[i]==1){
            count1++;
        }
        if(arr[i]==2){
            count2++;
        }
        if(arr[i]==3){
            count3++;
        }
        if(arr[i]==4){
            count4++;
        }
    }
    System.out.println(count+" "+count1+" "+count2+" "+count3);*/
}
}
