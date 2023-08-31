package models;

import java.util.List;

public class Map {
    public Route route;

    public Map(Route route) {
        this.route = route;
    }

    public void printRoute() {
        System.out.println("Route:");
        route.printSteps();
    }
}
