package com.marqumil.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "san";

        System.out.println(supplier.get());
    }
}
