package com.weng.demo.Demo05.no1.no1.extend.no1;

public class Account {
    /*写一个名为Account的类模拟账户。该类的属性和方法如下图所示。该类包括的属性:账号id,余额balance,年利率annualInterestRate;
    包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。
    提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。*/
    private int id;
    private double balance;
    private double annualInterestRate;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
//    取款方法withdraw(),存款方法deposit()。
//    提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。*/
    public void withdraw(double balance1){
        if (balance1 < balance) {
            this.balance=balance-balance1;
            System.out.println("成功取出"+balance1+"余额还剩余"+this.balance);
        }
        else {
            System.out.println("余额不足，取款失败");
        }


    }
    public void deposit(double balance2){
        this.balance=balance+balance2;
        System.out.println("成功取出"+balance2+"余额还剩余"+this.balance);


    }
}
