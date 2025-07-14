package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstantVectorTest {

    @Test
    public void constantVector() {
        var a = new ConstantVector(1, 2, 3);
        var expected = new ConstantVector(1, 2, 3);
        Assertions.assertEquals(expected, a);
    }

    @Test
    public void addAssignThrows() {
        var a = new ConstantVector(1, 2, 3);

        Assertions.assertThrows(Exception.class, () -> a.addAssign(new Vector(1, 2, 3)));
    }
}
