package models;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(this.radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Esphere with radius " + this.radius + " in " + super.toString();
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
