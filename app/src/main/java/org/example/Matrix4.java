package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Matrix4 {

    private final double[] items;

    public Matrix4(double... items) {
        if (items.length != 16) {
            throw new IllegalArgumentException("Matrix 4x4, expected 16 arguments, received " + items.length);
        }
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Matrix4 matrix4)) return false;
        return Objects.deepEquals(items, matrix4.items);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(items);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                sb.append(String.format("%10.4f", get(i, j)));
                sb.append('\t');
            }
            sb.append('\n');
        }

        return sb.toString();
    }

    public int index(int i, int j) {
        if (i < 0 || i > 4)
            throw new IndexOutOfBoundsException("row index " + i + " is out of bounds for matrix size 4x4");
        if (j < 0 || j > 4)
            throw new IndexOutOfBoundsException("column index " + j + " is out of bounds for matrix size 4x4");
        return i * 4 + j;
    }

    public double get(int i, int j) {
        return items[index(i, j)];
    }

    public void set(int i, int j, double d) {
        items[index(i, j)] = d;
    }

    public static final Matrix4 IDENTITY = new Matrix4(
            1, 0, 0, 0,
            0, 1, 0, 0,
            0, 0, 1, 0,
            0, 0, 0, 1
    );
}
