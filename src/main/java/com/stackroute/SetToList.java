package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SetToList {
    public static ArrayList<String> settolist(String[] testArr){
        return new ArrayList<>(new TreeSet<>(Arrays.asList(testArr)));
    }
}
