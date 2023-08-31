import models.Car;
import models.Color;
import models.Map;
import models.Route;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Color color = new Color(255, 255, 255);
        Car car = new Car("Fusca", 1970, color);
        Route route = new Route(1, List.of("UIS", "CENTRO", "ISLA"));
        Map map = new Map(route);
        car.calculateRoute(map);
    }
}
