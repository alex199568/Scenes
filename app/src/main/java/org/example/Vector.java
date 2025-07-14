package org.example;

public class Vector extends Xyz {

    public Vector(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public String toString() {
        return "Vector(" +
                x +
                ", " + y +
                ", " + z +
                ')';
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
