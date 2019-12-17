package com.weng.demo.Base.Note4;

public class case1 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
                if(j==9){
                    System.out.println("");
                }
            }
            
        }
    }
}
