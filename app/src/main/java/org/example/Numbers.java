package org.example;

public class Numbers {

    public static final double EPSILON = 1e-16;

    public static boolean eq(double d1, double d2) {
        return Math.abs(d1 - d2) < EPSILON;
    }
}
