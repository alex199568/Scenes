package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColorTest {

    @Test
    public void color() {
        var c = new Color(0.1, 0.2, 0.3);
        var expected = new Color(0.1, 0.2, 0.3);
        Assertions.assertEquals(expected, c);
    }

    @Test
    public void add() {
        var a = new Color(0.1, 0.2, 0.3);
        var b = new Color(0.2, 0.3, 0.4);
        var result = a.add(b);
        var expected = new Color(0.3, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void sub() {
        var a = new Color(0.9, 0.8, 0.7);
        var b = new Color(0.2, 0.3, 0.4);
        var result = a.sub(b);
        var expected = new Color(0.7, 0.5, 0.3);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void mulColor() {
        var a = new Color(1, 0.5, 0.1);
        var b = new Color(0.1, 0.5, 1);
        var result = a.mul(b);
        var expected = new Color(0.1, 0.25, 0.1);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void mulD() {
        var c = new Color(0.1, 0.2, 0.3);
        var result = c.mul(2);
        var expected = new Color(0.2, 0.4, 0.6);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void div() {
        var c = new Color(1, 0.8, 0.6);
        var result = c.div(2);
        var expected = new Color(0.5, 0.4, 0.3);
        Assertions.assertEquals(expected, result);
    }
}
