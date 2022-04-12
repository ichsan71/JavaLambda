package com.marqumil.app;


import java.util.*;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        // make list of strings
        List<String> lesti= new ArrayList<>();

        lesti.add("san");
        lesti.add("sin");
        lesti.add("sun");

        // pake yang foreach biasa
        for (String s : lesti) {
            System.out.println(s);
        }

        // forEaceh using maethod reference
        lesti.forEach(System.out::println);

        // forEaceh using anonnymous class
        lesti.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println();
            }
        });

        // forEaceh using lambda expression
        lesti.forEach(s -> System.out.println(s));
    }
}
