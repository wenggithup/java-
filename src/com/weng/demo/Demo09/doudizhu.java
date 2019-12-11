package com.weng.demo.Demo09;

import com.weng.demo.Demo04.A;

import java.util.Arrays;
import java.util.Random;

public class doudizhu {
    public static void main(String[] args) {

        int[] puke = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8
                , 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 15};
        int[] farmer1=new int[17];
        int[] farmer2=new int[17];
        int[] landlord=new int[20];
        int number1=0;int number2=0;int number3=0;
        for(int i=0;i<farmer1.length;i++){
            while (true){
                if(puke[number1]!=0&&puke[number2]!=0){
                    break;
                }
                number1=new Random().nextInt(54);
                number2=new Random().nextInt(54);
            }
            farmer1[i]=puke[number1];
            farmer2[i]=puke[number2];
            puke[number1]=0;
            puke[number2]=0;
        }

        System.out.println(Arrays.toString(farmer1));
        System.out.println(Arrays.toString(farmer2));
        for(int j=0;j<54;j++){
            if(puke[j]!=0){
                System.out.print(puke[j]+" ,");
            }

        }
    }

}
