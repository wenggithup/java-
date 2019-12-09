package com.weng.demo.Demo1.No1;

public class Book extends  Object{
    private String title;
    private int pageNum=200;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if(pageNum<200){
            System.out.println("页数不能小于两百");

        }else {
            this.pageNum = pageNum;
        }
    }
    public  void  detail(){
        System.out.println("书名："+getTitle()+"    页数为："+getPageNum());

    }
}
