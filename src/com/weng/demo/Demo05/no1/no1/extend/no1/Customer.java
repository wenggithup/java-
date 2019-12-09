package com.weng.demo.Demo05.no1.no1.extend.no1;

public class Customer extends Account{
//    a. 声明三个私有对象属性:firstName、lastName和account。
//    b. 声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l)
//    c. 声明两个公有存取器来访问该对象属性,方法getFirstName和getLastName返回相应的属性。
//    d. 声明setAccount 方法来对account属性赋值。
//    e. 声明getAccount 方法以获取account属性。
    private String firstName;
    private String lastName;
    private double account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}

