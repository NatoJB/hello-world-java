package com.example.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreeterTest {

    @Test
    void greetDefaultsToWorld() {
        assertEquals("Hello, world!", Greeter.greet(null));
        assertEquals("Hello, world!", Greeter.greet(" "));
    }

    @Test
    void greetUsesName() {
        assertEquals("Hello, Alice!", Greeter.greet("Alice"));
        assertEquals("Hello, Bob!", Greeter.greet("  Bob  "));
    }
}
