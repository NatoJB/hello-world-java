package com.example.helloworld;

/**
 * Simple greeter utility.
 */
public final class Greeter {

    private Greeter() {
        // utility class
    }

    /**
     * Returns a greeting message.
     * @param name name to greet
     * @return greeting string
     */
    public static String greet(String name) {
        String who = (name == null || name.isBlank()) ? "world" : name.trim();
        return "Hello, " + who + "!";
    }
}
