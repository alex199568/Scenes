package org.example;

import java.util.Objects;

public class Point {

    public double x;
    public double y;
    public double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point point)) return false;
        return Double.compare(x, point.x) == 0 &&
                Double.compare(y, point.y) == 0 &&
                Double.compare(z, point.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public Point add(Vector vector) {
        return new Point(x + vector.x, y + vector.y, z + vector.z);
    }

    public Point sub(Vector vector) {
        return new Point(x - vector.x, y - vector.y, z - vector.z);
    }

    public Vector sub(Point point) {
        return new Vector(x - point.x, y - point.y, z - point.z);
    }
}
