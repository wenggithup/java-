package com.weng.demo.Demo06.programme;

public class StaffClass implements Staff{
    private  double StaffClasshour;
    private  double StaffBasePay;


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
    public void interfacePay() {
        if(StaffClasshour>196){
            System.out.println("普通员工的薪资为："+getStaffBasePay()+(getStaffClasshour()-196)*200);

        }else {
            this.StaffBasePay=StaffBasePay;
        }

    }


}
