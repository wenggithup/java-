package com.weng.demo.Demo05.no1.no1;

public class Manager extends Person {
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
