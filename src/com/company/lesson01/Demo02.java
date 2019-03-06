package com.company.lesson01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("山西","太原");
        map.put("山东","济南");
        map.put("河南","郑州");
        map.put("河北","石家庄");
        //第一种：Set<K> keySet()
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+"=="+map.get(key));
        }
        System.out.println("=======");
        //第二种：Collection<V> values()
        Collection<String> values = map.values();
        for (String val : values) {
            System.out.println(val);
        }
        System.out.println("=======");
        //第三种：Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getValue()+"=="+entry.getKey());
        }


    }
}
