package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstantColorTest {

    @Test
    public void constantColor() {
        var a = new ConstantColor(0.1, 0.2, 0.3);
        var b = new Color(0.1, 0.2, 0.3);
        Assertions.assertEquals(a, b);
    }

    @Test
    public void addAssignThrows() {
        var c = new ConstantColor(0.1, 0.2, 0.3);

        Assertions.assertThrows(Exception.class, () -> c.addAssign(new Color(0.1, 0.2, 0.3)));
    }
}
