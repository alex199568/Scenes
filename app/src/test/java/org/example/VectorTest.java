package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VectorTest {

    @Test
    public void add() {
        var a = new Vector(1, 2, 3);
        var b = new Vector(2, 3, 4);
        var expected = new Vector(3, 5, 7);
        var result = a.add(b);
        Assertions.assertEquals(expected, result);
    }
}
