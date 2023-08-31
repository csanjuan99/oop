package models;

import java.util.List;

public class Route {
    public int id;
    public List<String> steps;
    public int quantitySteps;

    public Route(int id, List<String> steps) {
        this.id = id;
        this.steps = steps;
        this.quantitySteps = steps.size();
    }

    public void printSteps() {
        for (String step : steps) {
            System.out.println(step);
        }
    }
}
