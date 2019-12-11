package com.weng.demo.Demo09.exception;

public class Test {
    public void method(int m){

    }

    public static void main(String[] args) {
       /* int [] arr=new int[10];
        System.out.println(arr[0]);;
            int i = 1;
            i++;
           ;
        System.out.println( i++);int*/
       /*int b;
        int a=b = 5;
        String s1 = "祝你今天考出好成绩！";
        String s2 = s1;
        System.out.println(a==b);
        System.out.println(s1==s2);*/
        int total = 0;
        for ( int i = 0; i< 4; i++ ){
            System.out.println(i);
            if (i == 1){continue;}
                if ( i == 2){ break;}

            total += i;

        }System.out.println(total);
        /*String s;
        System.out.println("=");
        int  x=4;
        System.out.println("value  is  "+ ((x>4) ? 99.9:9));*/
        /*boolean a= "a" instanceof Object;
        System.out.println(a);
        method();
        String String="A";
        System.out.println(String);
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
    }*/
    }
}
