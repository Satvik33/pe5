package com.stackroute;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class NoOfCountsMap {
    public static void count(String str){
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] arr = str.split(" ");
        for(String s : arr){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }
        int i = 0;
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}
