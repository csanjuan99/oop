import models.Circle;
import models.Sphere;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Sphere sphere = new Sphere(5);
        System.out.println(sphere);

        System.out.println("Area: " + sphere.getArea());
        System.out.println("Perimeter: " + sphere.getPerimeter());
        System.out.println("Volume: " + sphere.getVolume());

    }
}
