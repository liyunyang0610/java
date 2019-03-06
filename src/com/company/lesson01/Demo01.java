package com.company.lesson01;

import java.util.*;

public class Demo01 {

    public static void main(String[] args) {
            //    list集合的四种遍历方法
          /*  Collection c1 = new ArrayList();
            c1.add("hello");
            c1.add("java");
            c1.add("world");*/
            //第一种
           /* Object[] array = c1.toArray();
            for (int i = 0; i <array.length ; i++) {
                String s = (String) array[i];
                System.out.println(s);}*/
            //第二种
           /* Iterator it = c1.iterator();
            while (it.hasNext()) {
            System.out.println(it.next());*/
            //// 第三种遍历
            ////用for循环中修改长度为list.size()的遍历方法
            List list = new ArrayList();
            list.add("太原");
            list.add("北京");
            list.add("苏州");
          /*  for (int i = 0; i < list.size(); i++) {
                Object o = list.get(i);
                System.out.println(o);*/
            // 第四种遍历
            // list专属迭代器的遍历方法
                ListIterator listIt = list.listIterator();
                while (listIt.hasNext()){
                    String s = (String) listIt.next();
                    if ("java".equals(s)){
                        listIt.add("大爷，你好");
                    }
                    System.out.println(s);
                }
                System.out.println(list);
            }
        }
  //  }
//}



