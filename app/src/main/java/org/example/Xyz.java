package org.example;

import java.util.Objects;

public class Xyz {

    public double x;
    public double y;
    public double z;

    public Xyz(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Xyz xyz)) return false;
        return Double.compare(x, xyz.x) == 0 &&
                Double.compare(y, xyz.y) == 0 &&
                Double.compare(z, xyz.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
