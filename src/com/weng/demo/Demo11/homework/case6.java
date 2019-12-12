package com.weng.demo.Demo11.homework;

public class case6 {
    /*
        int startnum=8;
        int endnum=14;
        String str="dasdasdasdsdadasdasdad";
        char rever[]=new char[endnum];
            public void reverse(){
                if(startnum<endnum){
                    for(int i=endnum;i<(endnum-startnum);i--){
                       rever [i]= str.charAt(i);
                    }

                }

        }
    */
    public static void main(String[] args) {
//        String s = "abcdefghijklmn";
//        String m = s.substring(2, 6);
//        String t = s.substring(0, 2);
//        String i = s.substring(7, 14);
//        StringBuffer s1 = new StringBuffer(m);
//        s1.reverse();
//        System.out.println(t + s1 + i);
        case6funtion c=new case6funtion();
        c.setStartnum(0);
        c.setEndnum(6);
        c.setStr("ABCDEFGHIJKLMN");
        c.reverse();

    }






}
