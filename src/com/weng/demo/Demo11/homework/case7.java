package com.weng.demo.Demo11.homework;

public class case7 {
   // To be or not to be
   public static void main(String[] args) {
       String str="To be or not to be";
       System.out.println(str.length());
       StringBuffer str1=new StringBuffer(str.substring(0,2));
       StringBuffer str2=new StringBuffer(str.substring(3,5));
       StringBuffer str3=new StringBuffer(str.substring(6,8));
       StringBuffer str4=new StringBuffer(str.substring(9,12));
       StringBuffer str5=new StringBuffer(str.substring(13,15));
       StringBuffer str6=new StringBuffer(str.substring(15,18));
       str1.reverse();str2.reverse();str3.reverse();str4.reverse();
       str5.reverse();str6.reverse();
       System.out.println(str1+" "+str2+" "+str3+" "+str4+" "+str5+" "+str6);
   }


}
