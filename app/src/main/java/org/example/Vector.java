package org.example;

import java.util.Objects;

public class Vector {

    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vector vector)) return false;
        return Double.compare(x, vector.x) == 0 &&
                Double.compare(y, vector.y) == 0 &&
                Double.compare(z, vector.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public Vector add(Vector other) {
        return new Vector(
                x + other.x,
                y + other.y,
                z + other.z
        );
    }
}
