package com.weng.demo.Demo04.no1;

public class Worker extends PerSon {
   /* v3.根据人类，创建一个工人类Worker
    增加属性：
    单位unit、工龄workAge；
    重写工作方法（工人的工作是盖房子）。*/
    private String unit;
    private int workAge;
    public void work(){
        System.out.println("工人的工作是盖房子");
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "unit='" + unit + '\'' +
                ", workAge=" + workAge +
                '}';
    }
}
