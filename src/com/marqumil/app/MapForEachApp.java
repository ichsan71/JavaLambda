package com.marqumil.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String,String> app = new HashMap<>();
        app.put("first_name", "muhammad");
        app.put("middle_name", "ichsan");
        app.put("last_name", "kamil");

        // for each loop
        app.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        // lambda expression
        app.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
