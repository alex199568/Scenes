package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Matrix4Test {

    @Test
    public void matrix4() {
        var a = new Matrix4(
                1, 2, 3, 4,
                2, 3, 4, 5,
                3, 4, 5, 6,
                4, 5, 6, 7
        );

        var b = new Matrix4(
                1, 2, 3, 4,
                2, 3, 4, 5,
                3, 4, 5, 6,
                4, 5, 6, 7
        );
        Assertions.assertEquals(a, b);
    }

    @Test
    public void setAndGet() {
        var a = new Matrix4(
                1, 2, 3, 4,
                2, 3, 4, 5,
                3, 4, 5, 6,
                4, 5, 6, 7
        );
        Assertions.assertEquals(4.0, a.get(1, 2));
        a.set(1, 2, 16);
        Assertions.assertEquals(16.0, a.get(1, 2));
    }

    @Test
    public void indexOutOfBounds() {
        var a = new Matrix4(
                1, 2, 3, 4,
                2, 3, 4, 5,
                3, 4, 5, 6,
                4, 5, 6, 7
        );
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> a.set(-1, 5, 2.0));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> a.get(4, -2));
    }
}
