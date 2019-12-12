package com.weng.demo.Demo11.homework;

public class case6funtion {
    private String str;
    private int startnum;
    private int endnum;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getStartnum() {
        return startnum;
    }

    public void setStartnum(int startnum) {
        this.startnum = startnum;
    }

    public int getEndnum() {
        return endnum;
    }

    public void setEndnum(int endnum) {
        this.endnum = endnum;
    }
    public void reverse() {
        if(getStartnum()!=0&&getEndnum()!=0){
            StringBuffer str3 = new StringBuffer(str.substring(getStartnum(), getEndnum()));
            String str1 = str.substring(0, getStartnum());
            String str2 = str.substring(getEndnum() , str.length());
            str3.reverse();
            this.str = str1 + str3+str2  ;
            System.out.println("反转后的字符为"+this.str);
        }else if(getStartnum()==0&&getEndnum()==0){
            this.str=str;
            System.out.println("反转后的字符为"+this.str);
        }else if(getStartnum()==0&&getEndnum()!=0){
            StringBuffer str4=new StringBuffer(str.substring(getStartnum(),getEndnum()));
            String str5=str.substring(getEndnum(),str.length());
            str4.reverse();
            this.str=str4+str5;
            System.out.println("反转后的字符为"+this.str);
        }else {
            this.str=str;
        }

    }

}
