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
    public double interfacePay() {
        double sum;
        if (selltotal < 10000) {
          sum=   getSelltotal() * 0.1 + getBasepay();
        } else if (selltotal > 100000) {
           sum= getSelltotal() * 0.18 + getBasepay();
        } else {
            sum= getSelltotal() * 0.15 + getBasepay();
        }
        return sum;
    }
    }

