package com.marqumil.app;

import com.marqumil.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        // anonym class
//        SimpleAction simpleAction1 = new SimpleAction(){
//            @Override
//            public String action(String name){
//                return name;
//            }
//        };
//
//        System.out.println(simpleAction1.action("san"));
//
//        // contoh lambda 1
//        SimpleAction simpleAction2 = (String name) -> {
//            return name;
//        };
//
//        System.out.println(simpleAction1.action("san"));

        // contoh lambda 1
        SimpleAction simpleAction1 = (String name) -> {
            return name;
        };

        // contoh lambda 2
        SimpleAction simpleAction2 = (name) -> {
            return "hello" + name;
        };

        // contoh lambda 3
        SimpleAction simpleAction3 = name -> "hello " + name;

    }


}
