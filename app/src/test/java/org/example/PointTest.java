package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void point() {
        var p = new Point(2, 3, 4);
        var expected = new Point(2, 3, 4);
        Assertions.assertEquals(expected, p);
    }

    @Test
    public void addVector() {
        var p = new Point(1, 2, 3);
        var v = new Vector(2, 3, 4);
        var result = p.add(v);
        var expected = new Point(3, 5, 7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void subVector() {
        var p = new Point(9, 8, 7);
        var v = new Vector(1, 2, 3);
        var result = p.sub(v);
        var expected = new Point(8, 6, 4);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void subPoint() {
        var p = new Point(9, 8, 7);
        var p2 = new Point(7, 3, 2);
        var result = p.sub(p2);
        var expected = new Vector(2, 5, 5);
        Assertions.assertEquals(expected, result);
    }
}
