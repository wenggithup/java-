package com.weng.demo.Demo12.homeWork;

import java.util.Iterator;
import java.util.TreeSet;

public class case2TreeSet{
    TreeSet<case2> ts=new TreeSet<>();
    public void casesave()  {

        for (int i = 0,j=10; i < 40; i++) {
            int stunum = i + 180201;
            String name = "同学" +j++;
            double grade = (int) (Math.random() * 50 + 50);
            ts.add(new case2(stunum, name, grade));

        }
    }
    public void caseprint() {
        Iterator<case2> iterator = this.ts.iterator();
        while (iterator.hasNext()) {
            case2 next1 = iterator.next();
            int stunum = next1.getStunum();
            String name = next1.getName();
            double grade = next1.getGrade();
            System.out.println("学号" + stunum + ", 姓名" + name + ", 成绩" + grade);

        }
    }

    }


