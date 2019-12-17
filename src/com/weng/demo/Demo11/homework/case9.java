package com.weng.demo.Demo11.homework;

public class case9 {
    private int stunum;
    private String stuname;

    public int getStunum() {
        return stunum;
    }

    public void setStunum(int stunum) {
        this.stunum = stunum;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public case9(int stunum, String stuname) {
        this.stunum = stunum+1;
        this.stuname = stuname;
    }

    public void add(int stunum){
        this.stunum=getStunum()+1;
    }
    public void delete(int stunum){
        this.stunum=getStunum()+1;
    }
    public void select(int stunum){
        this.stunum=getStunum()+1;
    }
    public void update(int stunum){
        this.stunum=getStunum()+1;
    }
}
