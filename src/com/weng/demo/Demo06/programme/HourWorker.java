package com.weng.demo.Demo06.programme;

public class HourWorker extends StaffClass implements Staff{
    private double hour;
    private double hourpay;
    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHourpay() {
        return hourpay;
    }

    public void setHourpay(double hourpay) {
        this.hourpay = hourpay;
    }


    @Override
    public double interfacePay() {

    return hour*hourpay;
    }
}
