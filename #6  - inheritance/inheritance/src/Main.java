import models.AssistantManager;
import models.Director;
import models.Manager;

public class Main {
    public static void main(String[] args) {

        System.out.println("Manager");
        Manager manager = new Manager("John", "Manager");
        System.out.println("Name: " + manager.getName());
        System.out.println("Role: " + manager.getRole());
        System.out.println("Salary: " + manager.CalculateSalary());
        System.out.println();

        System.out.println("Director");
        Manager director = new Director("Jane", "Director");
        System.out.println("Name: " + director.getName());
        System.out.println("Role: " + director.getRole());
        System.out.println("Salary: " + director.CalculateSalary());
        System.out.println();

        System.out.println("Assistant Manager");
        Manager assistantManager = new AssistantManager("Jack", "Assistant Manager");
        System.out.println("Name: " + assistantManager.getName());
        System.out.println("Role: " + assistantManager.getRole());
        System.out.println("Salary: " + assistantManager.CalculateSalary());
        System.out.println();

    }
}
