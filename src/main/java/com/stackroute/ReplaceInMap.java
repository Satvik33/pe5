package com.stackroute;

import java.util.HashMap;

public class ReplaceInMap {
    public static HashMap<String, String> modifyMap(HashMap map) {
        if (map.get("key1").toString().isEmpty()) {
            return map;
        } else {
            map.put("key2", map.get("key1"));
            map.put("key1", "");
            return map;
        }
    }
}
