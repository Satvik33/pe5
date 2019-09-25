package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class CheckCharacterOccurence {
    public static void check(char[] arr){
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char c : arr) {
            if (charCount.containsKey(c)) {


                charCount.put(c, charCount.get(c) + 1);
            }
            else {


                charCount.put(c, 1);
            }
        }
        for(Map.Entry entry : charCount.entrySet()){
            Integer val = (Integer)entry.getValue();
            if(val >= 2) {
                entry.setValue(true);

            }
            else{
                entry.setValue(false);

            }
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
