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
}
