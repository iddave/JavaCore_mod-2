package com.Laliev.javacore.mod1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class first {
    public static void main(String[] args) {
        int[] ar1 = {6, 4, 6, 8, 1, 100, -100},
              ar2 = {3, 8, 567, -42, 100, 1};
        HashSet<Integer> hs = new HashSet<Integer>();
        TreeSet<Integer> ts = new TreeSet<Integer>();

        for(int i : ar1)
            hs.add(i);

        for(int i : ar2)
            if(hs.contains(i)) ts.add(i);
        System.out.println(ts);


    }
}
