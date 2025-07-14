package org.example;

public class ConstantColor extends Color {

    public ConstantColor(double r, double g, double b) {
        super(r, g, b);
    }

    @Override
    public void addAssign(Color other) {
        throw new RuntimeException("Attempt to modify constant color");
    }
}
