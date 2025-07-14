package org.example;

public class ConstantVector extends Vector {

    public ConstantVector(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public void addAssign(Vector other) {
        throw new RuntimeException("Attempt to modify constant vector");
    }
}
