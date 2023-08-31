package models;

public class Car {
    public String model;
    public int year;
    public Color color;

    public Car(String model, int year, Color color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void calculateRoute(Map map) {
        System.out.println("Calculating route...");
        map.printRoute();
    }

}
