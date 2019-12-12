package com.weng.demo.Demo12.homeWork;

import java.util.*;

public class caseprint {
    ArrayList<case2> arr = new ArrayList<>();
    public void casesave() {
        for (int i = 0,j=10; i < 40; i++) {
            int stunum = i + 180201;
            String name = "同学" +j++;
            double grade = (int) (Math.random() * 50 + 50);
            arr.add(new case2(stunum, name, grade));
        }
    }

    public void compare() {
        Comparator<case2> comparable = new Comparator<case2>() {
            @Override
            public int compare(case2 o1, case2 o2) {
                int num = o2.getGrade() > o1.getGrade() ? 1 : o2.getGrade() <
                        o1.getGrade() ? -1 : o1.getStunum() - o2.getStunum();
                return num;
            }

        };
        Collections.sort(arr,comparable);

    }
    public void caseprint(){
        Iterator <case2> iterator=this.arr.iterator();
        while (iterator.hasNext()){
            case2 next1=iterator.next();
            int stunum=next1.getStunum();
            String name=next1.getName();
            double grade=next1.getGrade();
            System.out.println("学号"+stunum+", 姓名"+name+", 成绩"+grade);
        }
    }
}