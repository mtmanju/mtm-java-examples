package com.mtm.examples.ex;

public class ConstructorOverlioading {

    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    public ConstructorOverlioading(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    public ConstructorOverlioading() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    public ConstructorOverlioading(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    public double volume() {
        return width * height * depth;
    }
}
