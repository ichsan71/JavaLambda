package com.marqumil.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> predicateCheckBlank = s -> s.isEmpty();


        System.out.println(predicateCheckBlank.test("wkwk"));
    }
}
