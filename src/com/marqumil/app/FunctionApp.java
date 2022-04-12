package com.marqumil.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        Function<String, Integer> FunctionLength = value -> value.length();

        System.out.println(FunctionLength.apply("Hello"));
    }
}
