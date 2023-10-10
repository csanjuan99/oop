package models;

import java.util.ArrayList;
import java.util.List;


public class Payroll {

    private final List<Employee> employees;

    public Payroll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void getPayroll() {
        for (Employee employee : employees) {
            System.out.println("***************");
            System.out.println(employee.getName() + " " + employee.getLastname() + " " + employee.getSalary());
            System.out.println(employee.getSalary());
            System.out.println(employee);
        }
    }
}
