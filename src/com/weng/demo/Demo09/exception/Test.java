package com.weng.demo.Demo09.exception;

public class Test {

    public static void main(String[] args) {
    method();
    }
    public static int method(){
        try{
            int i=1/0;
            System.out.println("try");
  return 5;

        }catch (Exception e){
            System.out.println("catch");
            return 6;
    }finally {
            System.out.println("finally");
            //return 7;
    }
    }
}
