package com.marqumil.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
        // ini optional lambda biasa
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionaNameUpper = optionalName.map(String::toUpperCase);
        optionaNameUpper.ifPresent(value -> System.out.println("Hello " + value));

        // ini optional lambda yang lebih simple
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(value -> System.out.println("Hello " + value));

        // ini optional lambda lebih dari 2 kondisi
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("Hello " + value),
//                        () -> System.out.println("Hello World")
//                );
    }
}
