package com.weng.demo.Demo06.programme;

public class Sell extends  StaffClass implements Staff {
    private double selltotal;
    private double basepay;

    public double getSelltotal() {
        return selltotal;
    }

    public double getBasepay() {
        return basepay;
    }

    public void setSelltotal(double selltotal) {
        this.selltotal = selltotal;
    }

    public void setBasepay(double basepay) {
        this.basepay = basepay;
    }

    @Override
    public void interfacePay() {
        if (selltotal < 10000) {
            System.out.println("售货员的薪资为：" + getSelltotal() * 0.1 + getBasepay());
        }
            else if (selltotal> 100000) {
                System.out.println("售货员的薪资为："+getSelltotal()*0.18+getBasepay());
            } else {
                System.out.println("售货员的薪资为："+getSelltotal()*0.15+getBasepay());
            }

        }
    }

