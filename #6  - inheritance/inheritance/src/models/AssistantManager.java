package models;

public class AssistantManager extends Manager {

    public AssistantManager(String name, String role) {
        super(name, role);
    }

    @Override
    public int CalculateSalary() {
        return 150000;
    }
}
