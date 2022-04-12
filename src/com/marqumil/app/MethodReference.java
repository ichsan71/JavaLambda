package com.marqumil.app;

import com.marqumil.util.StringUtil;

import java.util.function.Predicate;

public class MethodReference {
    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        methodReference.run();
    }

    // make void method run
    public void run() {
        // Method reference to a static method
        Predicate<String> predicateIsLowerCase = MethodReference.this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hello"));
    }

    public boolean isLowerCase(String value){
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
