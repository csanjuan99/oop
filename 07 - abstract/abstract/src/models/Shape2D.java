package models;

public abstract class Shape2D extends Point {

    public Shape2D() {
        super();
    }

    public Shape2D(double x, double y) {
        super(x, y, 0);
    }

    public Shape2D(double x, double y, double z) {
        super(x, y, z);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
