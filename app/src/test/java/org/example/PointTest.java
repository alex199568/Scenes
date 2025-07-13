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
}
