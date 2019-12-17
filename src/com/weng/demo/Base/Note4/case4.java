package com.weng.demo.Base.Note4;

public class case4 {
//    定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
public static void main(String[] args) {
    int []arr={10,9,6,4,12,3,4,5,1,5};
    int max=0;
    int index=0;
    for (int i = 0; i <10 ; i++) {
        if(arr[i]>max){
            max=arr[i];
            index=i;
        }


    }
    System.out.println(max+"-----"+index);
}
}
