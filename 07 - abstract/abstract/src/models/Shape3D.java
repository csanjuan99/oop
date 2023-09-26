package models;

public abstract class Shape3D extends Point {

    public Shape3D() {
        super();
    }

    public Shape3D(double x, double y) {
        super(x, y, 0);
    }

    public Shape3D(double x, double y, double z) {
        super(x, y, z);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double getVolume();

    public String toString() {
        return super.toString();
    }
}
