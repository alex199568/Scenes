package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImageTest {

    @Test
    public void image() {
        var i = new Image(8, 4);
        var i2 = new Image(8, 4);
        Assertions.assertEquals(i, i2);
    }

    @Test
    public void getAndSet() {
        var i = new Image(8, 4);
        Assertions.assertEquals(Colors.BLACK, i.get(1, 2));
        i.set(1, 2, Colors.RED);
        Assertions.assertEquals(Colors.RED, i.get(1, 2));
    }

    @Test
    public void outOfBounds() {
        var i = new Image(8, 4);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> i.set(-1, 4, Colors.RED));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> i.get(8, -1));
    }
}
