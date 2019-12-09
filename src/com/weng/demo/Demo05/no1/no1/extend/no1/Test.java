package com.weng.demo.Demo05.no1.no1.extend.no1;

public class Test {
    public static void main(String[] args) {
//        (1)创建一个Customer ,名字叫 Jane Smith, 他有一个账号为1000,余额为2000元,年利率为 1.23% 的账户。
//        (2)对Jane Smith操作。
//        存入 100 元,再取出960元。再取出2000元。打印出Jane Smith 的基本信息
//        成功存入 :100.0,成功取出:960.0,余额不足,取款失败
        Customer customer=new Customer("Jane Smith","Jane Smith");
        customer.setId(1000);
        customer.setBalance(2000);
        customer.setAnnualInterestRate(0.0123);
        customer.deposit(100);
        customer.withdraw(960);
        customer.withdraw(2000);



    }
}
