package com.marqumil.app;

import java.util.function.Supplier;

public class LazzyApp {
    public static void main(String[] args) {

        testScore(60, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name){
        if (score >= 80){
            System.out.println("Congratulations " + name.get() + "! You passed the exam!");
        }else {
            System.out.println("You are not passed");
        }
    }

    public static String getName(){
        System.out.println("Method di panggil");
        return "san";
    }
}
