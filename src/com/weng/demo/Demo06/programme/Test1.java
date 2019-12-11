package com.weng.demo.Demo06.programme;

public class Test1 {
    public static void main(String[] args) {
        Company company=new Company();
        HourWorker hourWorker=new HourWorker();
        hourWorker.setHour(200);
        hourWorker.setHourpay(10);
        HourWorker hourWorker1=new HourWorker();
        hourWorker1.setHour(230);
        hourWorker1.setHourpay(10);
//        一个公司对象；
//        一个小时工的对象，每小时工资10，工作 200 小时；
//        一个小时工的对象，每小时工资10，工作 230 小时；
//        一个销售员工的对象，销售额5000；
//        一个销售员工的对象，销售额200000；
//        一个普通员工对象，工作小时205 小时。
        Sell sell=new Sell();
        sell.setSelltotal(5000);
        Sell sell1=new Sell();
        sell.setSelltotal(2000000);
        StaffClass staffClass=new StaffClass();
      staffClass.setStaffClasshour(205);
//        hourWorker.interfacePay();
//        hourWorker1.interfacePay();
        System.out.println("工资总和"+company.showAllPay());
    }
}
