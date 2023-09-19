package models;

public class Director extends Manager{

    public Director(String name, String role) {
        super(name, role);
    }

    @Override
    public int CalculateSalary() {
        return 200000;
    }
}
