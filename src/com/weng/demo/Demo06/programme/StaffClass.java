package com.weng.demo.Demo06.programme;

public class StaffClass implements Staff {
    private double StaffClasshour;
    private double StaffBasePay;
    private String name;

    public StaffClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StaffClass(double staffClasshour, double staffBasePay, String name) {
        StaffClasshour = staffClasshour;
        StaffBasePay = staffBasePay;
        this.name = name;
    }

    public void setStaffClasshour(double staffClasshour) {
        StaffClasshour = staffClasshour;
    }

    public double getStaffClasshour() {
        return StaffClasshour;
    }

    public double getStaffBasePay() {
        return StaffBasePay;
    }

    @Override
    public double interfacePay() {
        double sum1;
        if (StaffClasshour > 196) {
            sum1=getStaffBasePay() + (getStaffClasshour() - 196) * 200;

        } else {
                sum1=this.getStaffBasePay();
        }

        return sum1;
    }
}
