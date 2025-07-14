package org.example;

public class Point extends Xyz {

    public Point(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
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
