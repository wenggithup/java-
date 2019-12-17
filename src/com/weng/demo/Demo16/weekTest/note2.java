package com.weng.demo.Demo16.weekTest;

import java.util.*;

public class note2 {
    public static void main(String[] args) {
        System.out.println("请输入字符串，按回车结束");
        Scanner  s=new Scanner(System.in);
        String  str=s.nextLine();
        String [] st=str.split(" ");//String方法中的split方法。
        List list=new ArrayList();
        for (int i = 0; i <st.length ; i++) {
            list.add(st[i]);
        }
        Collections.sort(list, new Comparator<String>() {//重写Collection.sort中的Comparator方法
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(list);

//        List<String> lis=Arrays.asList(st);
//        Collections.sort(lis,new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        System.out.print(lis);

    }

}
