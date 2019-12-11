package com.weng.demo.Demo06.programme;

public class Company {
    private StaffClass[] staffclass = new StaffClass[20];

    public void setStaffclass(StaffClass[] staffclass) {
        this.staffclass = staffclass;//增加员工
    }

    public StaffClass[] getStaffclass() {
        return staffclass;
    }

    public void deleteStaffclass(String name) {
        StaffClass staffClass1 = new StaffClass();
        for (int i = 0; i < staffclass.length; i++) {
            if (this.staffclass[i].getName().equals(name)) {
                this.staffclass[i] = null;
            }
        }

    }

    public double showPay(String name) {
        for (int i = 0; i < staffclass.length; i++) {
            if (staffclass[i].getName().equals(name)) {
                return this.staffclass[i].interfacePay();

            }
        }
        return 0;

    }
    public double showAllPay(){
        double sallsum = 0;
        for(int i=0;i<staffclass.length;i++){
            sallsum+=staffclass[i].interfacePay();
        }
        return sallsum;
        }
}

