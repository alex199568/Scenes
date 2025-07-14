package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XyzTest {

    @Test
    public void xyz() {
        var a = new Xyz(1, 2, 3);
        var b = new Xyz(1, 2, 3);
        Assertions.assertEquals(a, b);
    }
}
