package edu.cnm.deepdive;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void sayHello() {
        assertEquals("Hello",new Hello().sayHello());
    }
}