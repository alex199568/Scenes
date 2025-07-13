package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    public void eq() {
        var d1 = 0.1;
        var d2 = 0.1;
        Assertions.assertTrue(Numbers.eq(d1, d2));
    }

    @Test
    public void eqCloseNumbers() {
        var d1 = 0.29999999999999993;
        var d2 = 0.3;
        Assertions.assertTrue(Numbers.eq(d1, d2));
    }

    @Test
    public void eqDifferentNumbers() {
        var d1 = 0.29999999999999933;
        var d2 = 0.3;
        Assertions.assertFalse(Numbers.eq(d1, d2));
    }
}
