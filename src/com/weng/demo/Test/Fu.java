package com.weng.demo.Test;

import com.weng.demo.Student;

public class Fu extends grade{
    private String username;
    public static String password="123cd";
    public  Fu(){
        System.out.println("这是父类无参构造器");
    }
    public  Fu(String username){
        this.username=username;
        System.out.println("这是父类有参构造器");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Fu{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
