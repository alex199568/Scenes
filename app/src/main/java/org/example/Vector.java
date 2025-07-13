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
        return "Vector(" +
                x +
                ", " + y +
                ", " + z +
                ')';
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

    public Vector neg() {
        return new Vector(-x, -y, -z);
    }

    public Vector add(Vector other) {
        return new Vector(
                x + other.x,
                y + other.y,
                z + other.z
        );
    }

    public Vector sub(Vector other) {
        return new Vector(
                x - other.x,
                y - other.y,
                z - other.z
        );
    }

    public Vector mul(double d) {
        return new Vector(
                x * d,
                y * d,
                z * d
        );
    }

    public Vector div(double d) {
        return new Vector(
                x / d,
                y / d,
                z / d
        );
    }

    public double dot(Vector other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector cross(Vector other) {
        return new Vector(
                y * other.z - z * other.y,
                z * other.x - x * other.z,
                x * other.y - y * other.x
        );
    }

    public double squaredLength() {
        return dot(this);
    }

    public double length() {
        return Math.sqrt(squaredLength());
    }

    public Vector unit() {
        return div(length());
    }
}
