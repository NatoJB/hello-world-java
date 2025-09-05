package com.example.helloworld;

public class Main {
    public static void main(String[] args) {
        String name = (args != null && args.length > 0) ? args[0] : null;
        System.out.println(Greeter.greet(name));
    }
}
