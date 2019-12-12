package com.weng.demo.jichu.Note3;

public class case4 {
    public static void main(String[] args) {
        int arr[]=new int[1000];
        for(int i=1;i<100;i++){
            if(i%5==0&&i%6==0){
                continue;
            }else if(i%5!=0&&i%6!=0){
                continue;
            }else {
                arr[i]=i;
            }
            if(arr[i]!=0){
                System.out.print(arr[i]+" ,");
            }


        }
    }

}
