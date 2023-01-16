package com.example.useoptionals.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * when we use generics, we could change most of the run time errors to compile time checks!
 */

public class Basics {
    public static void main(String[] args) {
        List list = new ArrayList<>(5);
        list.add("Colorado");
        list.add("Texas");
        list.add("Arkansas");
        list.add(23);

        String bestState = (String) list.get(2); // casting to Sting at run time which is expensive
        System.out.println(bestState);

        String bestState1 = (String) list.get(3); // this error is not found in compile time at all
        System.out.println(bestState1);


        // Use generics to avoid this situation:

        List<String> list2 = new ArrayList<>(5);
        list2.add("Colorado");
        list2.add("Texas");
        list2.add("Arkansas");

        String bestState2 = list2.get(0); // casting to Sting not necessary
        System.out.println(bestState2);
    }
}
