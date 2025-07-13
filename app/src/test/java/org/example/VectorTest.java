package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VectorTest {

    @Test
    public void vector() {
        var a = new Vector(1, 2, 3);
        var expected = new Vector(1, 2, 3);
        Assertions.assertEquals(expected, a);
    }

    @Test
    public void neg() {
        var v = new Vector(1, -2, 3);
        var result = v.neg();
        var expected = new Vector(-1, 2, -3);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void add() {
        var a = new Vector(1, 2, 3);
        var b = new Vector(2, 3, 4);
        var expected = new Vector(3, 5, 7);
        var result = a.add(b);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void sub() {
        var a = new Vector(9, 8, 7);
        var b = new Vector(3, 4, 5);
        var expected = new Vector(6, 4, 2);
        var result = a.sub(b);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void mul() {
        var v = new Vector(2, 3, 4);
        var result = v.mul(2);
        var expected = new Vector(4, 6, 8);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void div() {
        var v = new Vector(2, 3, 4);
        var result = v.div(2);
        var expected = new Vector(1, 1.5, 2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void dot() {
        var a = new Vector(1, 2, 3);
        var b = new Vector(2, 3, 4);
        var result = a.dot(b);
        Assertions.assertEquals(20.0, result);
    }

    @Test
    public void squaredLength() {
        var v = new Vector(1, 2, 3);
        var result = v.squaredLength();
        Assertions.assertEquals(14.0, result);
    }

    @Test
    public void length() {
        var v = new Vector(1, 2, 3);
        var result = v.length();
        Assertions.assertEquals(3.7416573867739413, result);
    }
}
