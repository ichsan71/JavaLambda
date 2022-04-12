package com.marqumil.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        // array list
        List<String> names = new ArrayList<>();
        names.add("Johnieeee");
        names.add("Jane");
        names.add("san");

        // remove if anonnymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        // remove if lambda
        names.removeIf(value -> value.length() > 5);

        System.out.println(names);


    }
}
